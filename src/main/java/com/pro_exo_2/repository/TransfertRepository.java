package com.pro_exo_2.repository;

import com.pro_exo_2.entities.Transfert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransfertRepository extends JpaRepository<Transfert,Integer> {
}
