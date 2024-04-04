package com.company.katadelivrery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.katadelivrery.entity.ModeLivraison;

@Repository
public interface ModeLivraisonRepository extends CrudRepository<ModeLivraison, Long> {

}
