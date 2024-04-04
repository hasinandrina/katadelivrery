package com.company.katadelivrery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.katadelivrery.entity.Commande;

@Repository
public interface CommandeRepository extends CrudRepository<Commande, Long> {

}
