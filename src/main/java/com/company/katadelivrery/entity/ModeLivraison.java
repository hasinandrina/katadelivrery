package com.company.katadelivrery.entity;

import jakarta.persistence.Entity;

/**
 * 
 * @author Hasina
 *
 */
@Entity
public class ModeLivraison extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private String libelle;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "ModeLivraison [id=" + id + ", libelle=" + libelle + "]";
	}

}
