package com.pro_exo_2.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data @NoArgsConstructor
public class Employer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpl;
    @Column(nullable = false)
    private String nomEmpl;
    private String prenomEmpl;
    @Column(nullable = false)
    private String typeFonctionEmpl;
    @Column(nullable = false,unique = true,length = 60)
    private String cinEmpl;
    @Column(nullable = false,unique = true,length = 20)
    private String emailEmpl;
    @Column(nullable = false,unique = true)
    private String pseudoEmpl;
    @Column(nullable = false,length = 60)
    private String motDePassEmpl;

    @OneToMany(mappedBy = "employer",fetch = FetchType.LAZY)
    private List<Inscrire> inscrire;
    @OneToMany(mappedBy = "employer",fetch = FetchType.LAZY)
    private List<Transfert> transfert;

    public Employer(String nomEmpl, String prenomEmpl, String typeFonctionEmpl, String cinEmpl, String emailEmpl, String pseudoEmpl, String motDePassEmpl) {
        this.nomEmpl = nomEmpl;
        this.prenomEmpl = prenomEmpl;
        this.typeFonctionEmpl = typeFonctionEmpl;
        this.cinEmpl = cinEmpl;
        this.emailEmpl = emailEmpl;
        this.pseudoEmpl = pseudoEmpl;
        this.motDePassEmpl = motDePassEmpl;
    }
}