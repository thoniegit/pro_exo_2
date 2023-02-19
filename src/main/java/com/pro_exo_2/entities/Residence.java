package com.pro_exo_2.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data @NoArgsConstructor
public class Residence implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRes;
    @Column(nullable = false)
    private String nomRes;
    @Column(nullable = false)
    private String AdressRes;
    @Column(nullable = false, length = 60)
    private int nombredePlaceRes;
    @Column(nullable = false)
    private String nomDirRes;
    private String prenomDirRes;
    @Column(nullable = false,length = 60)
    private String contactDirRes;
    @OneToMany(mappedBy = "residence",fetch = FetchType.LAZY)
    private List<Bloc> bloc;

    public Residence(String nomRes, String adressRes, int nombredePlaceRes, String nomDirRes, String prenomDirRes, String contactDirRes) {
        this.nomRes = nomRes;
        this.AdressRes = adressRes;
        this.nombredePlaceRes = nombredePlaceRes;
        this.nomDirRes = nomDirRes;
        this.prenomDirRes = prenomDirRes;
        this.contactDirRes = contactDirRes;
    }

    public Residence(String nomRes, String adressRes, int nombredePlaceRes, String nomDirRes, String prenomDirRes, String contactDirRes, List<Bloc> bloc) {
        this.nomRes = nomRes;
        this.AdressRes = adressRes;
        this.nombredePlaceRes = nombredePlaceRes;
        this.nomDirRes = nomDirRes;
        this.prenomDirRes = prenomDirRes;
        this.contactDirRes = contactDirRes;
        this.bloc = bloc;
    }
}