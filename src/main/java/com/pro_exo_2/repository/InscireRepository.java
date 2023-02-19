package com.pro_exo_2.repository;

import com.pro_exo_2.entities.Inscrire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscireRepository extends JpaRepository<Inscrire,Integer> {
}
