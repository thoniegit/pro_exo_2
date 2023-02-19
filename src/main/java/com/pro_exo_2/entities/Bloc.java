package com.pro_exo_2.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data @NoArgsConstructor
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBloc;
    @Column(nullable = false)
    private String nomBloc;
    @Column(nullable = false)
    private String typeBloc;
    @Column(nullable = false,length = 60)
    private String nombrePlaceParBloc;
    @ManyToOne
    @JoinColumn(name = "idRes")
    private Residence residence;

    @OneToMany(mappedBy = "bloc",fetch =FetchType.LAZY)
    private List<Chambre> chambre;

    public Bloc(String nomBloc, String typeBloc, String nombrePlaceParBloc) {
        this.nomBloc = nomBloc;
        this.typeBloc = typeBloc;
        this.nombrePlaceParBloc = nombrePlaceParBloc;
    }

}
