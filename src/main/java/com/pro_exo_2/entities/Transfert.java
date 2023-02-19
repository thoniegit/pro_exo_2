package com.pro_exo_2.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Data @NoArgsConstructor
public class Transfert implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTransf;
    @Column(nullable = false)
    private String motifTransf;
    @Column(nullable = false)
    private String origineTransf;
    @Column(nullable = false)
    private String destinationTransf;
    @Column(nullable = false,length = 20)
    private Date dateTransf;

    @ManyToOne
    @JoinColumn(name = "idChamb")
    private Chambre chambre;
    @ManyToOne
    @JoinColumn(name = "idChambDest")
    private Chambre chambreDestination;
    @ManyToOne
    @JoinColumn(name = "idEmpl")
    private Employer employer;

    public Transfert(String motifTransf, String origineTransf, String destinationTransf, Date dateTransf, Chambre chambre, Chambre chambreDestination, Employer employer) {
        this.motifTransf = motifTransf;
        this.origineTransf = origineTransf;
        this.destinationTransf = destinationTransf;
        this.dateTransf = dateTransf;
        this.chambre = chambre;
        this.chambreDestination = chambreDestination;
        this.employer = employer;
    }
}
