package com.pro_exo_2.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor
public class Etudiant implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEt;
    @Column(nullable = false)
    private String nomEt;
    private String prenomEt;
    @Column(nullable = false,length = 60)
    private String sexEt;
    @Column(nullable = false)
    private String lieuNaissanceEt;
    @Column(nullable = false,length = 20)
    private Date   dateNaissanceEt;
    @Column(nullable = false)
    private String adressEt;
    @Column(nullable = false,length = 60)
    private String nationaliteEt;
    @Column(nullable = false)
    private String photoEt;
    @Column(nullable = false,length = 60)
    private String filiereEt;
    @Column(nullable = false)
    private String niveauEt;
    @Column(nullable = false,length = 60)
    private String serieBaccEt;
    @Column(nullable = false,length = 20)
    private Date anneeObtentionBaccEt;

    @OneToMany(mappedBy = "etudiant")
    private List<Inscrire> inscrire;


    public Etudiant(String nomEt, String prenomEt, String sexEt, String lieuNaissanceEt, Date dateNaissanceEt, String adressEt, String nationaliteEt, String photoEt, String filiereEt, String serieBaccEt, Date anneeObtentionBaccEt) {
        this.nomEt = nomEt;
        this.prenomEt = prenomEt;
        this.sexEt = sexEt;
        this.lieuNaissanceEt = lieuNaissanceEt;
        this.dateNaissanceEt = dateNaissanceEt;
        this.adressEt = adressEt;
        this.nationaliteEt = nationaliteEt;
        this.photoEt = photoEt;
        this.filiereEt = filiereEt;
        this.serieBaccEt = serieBaccEt;
        this.anneeObtentionBaccEt = anneeObtentionBaccEt;
    }
}