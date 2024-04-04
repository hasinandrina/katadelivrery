package com.company.katadelivrery.entity;

import jakarta.persistence.Entity;

@Entity
public class Client extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + "]";
	}

}
