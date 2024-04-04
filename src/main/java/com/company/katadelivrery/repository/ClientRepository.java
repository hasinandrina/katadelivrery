package com.company.katadelivrery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.katadelivrery.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}
