package com.company.katadelivrery.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.katadelivrery.entity.CreneauHoraire;

@Repository
public interface CreneauHoraireRepository extends CrudRepository<CreneauHoraire, Long> {

	List<CreneauHoraire> findByModeLivraisonId(Long modeLivraisonId);

}
