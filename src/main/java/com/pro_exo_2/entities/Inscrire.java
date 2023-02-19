package com.pro_exo_2.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data @NoArgsConstructor
public class Inscrire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idIns;
    @Column(nullable = false,length = 20)
    private Date anneeIns;
    @Column(nullable = false)
    private String statusIns;//Redoublant ou Admis
    @ManyToOne
    @JoinColumn(name = "idEt")
    private Etudiant etudiant;
    @ManyToOne
    @JoinColumn(name = "idChamb")
    private Chambre chambre;
    @ManyToOne
    @JoinColumn(name = "idEmpl")
    private Employer employer;

    public Inscrire(Date anneeIns, String statusIns) {
        this.anneeIns = anneeIns;
        this.statusIns = statusIns;
    }
}