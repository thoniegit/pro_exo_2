package com.pro_exo_2.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data @NoArgsConstructor
public class Chambre  implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idChamb;
    @Column(nullable = false,length = 60)
    private int numeroChambre;
    @Column(nullable = false,length = 60)
    private int capaciteChambre;
    @Column(nullable = false,length = 60)
    private int nombrePlaceLibre;
    @ManyToOne
    @JoinColumn(name = "idBloc")
    private Bloc bloc;

    @OneToMany(mappedBy = "chambre")

    private List<Inscrire> inscrire;

    @OneToMany(mappedBy = "chambre")
    private List<Transfert> transfert;

    @OneToMany(mappedBy = "chambreDestination")
    private List<Transfert> transferts;

    public Chambre(int numeroChambre, int capaciteChambre, int nombrePlaceLibre) {
        this.numeroChambre = numeroChambre;
        this.capaciteChambre = capaciteChambre;
        this.nombrePlaceLibre = nombrePlaceLibre;
    }
}