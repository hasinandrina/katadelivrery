package com.company.katadelivrery.entity;

import java.sql.Time;

import jakarta.persistence.Entity;

@Entity
public class CreneauHoraire extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private String libelle;

	private Time heureDebut;

	private Time heureFin;

	private ModeLivraison modeLivraison;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Time getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Time heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Time getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Time heureFin) {
		this.heureFin = heureFin;
	}

	public ModeLivraison getModeLivraison() {
		return modeLivraison;
	}

	public void setModeLivraison(ModeLivraison modeLivraison) {
		this.modeLivraison = modeLivraison;
	}

	@Override
	public String toString() {
		return "CreneauHoraire [id=" + id + ", libelle=" + libelle + ", heureDebut=" + heureDebut + ", heureFin="
				+ heureFin + ", modeLivraison=" + modeLivraison + "]";
	}

}
