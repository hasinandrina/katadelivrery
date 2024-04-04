package com.company.katadelivrery.entity;

import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class Commande extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private Client client;

	private ModeLivraison modeLivraison;

	private Date jour;

	private CreneauHoraire creneauHoraire;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ModeLivraison getModeLivraison() {
		return modeLivraison;
	}

	public void setModeLivraison(ModeLivraison modeLivraison) {
		this.modeLivraison = modeLivraison;
	}

	public Date getJour() {
		return jour;
	}

	public void setJour(Date jour) {
		this.jour = jour;
	}

	public CreneauHoraire getCreneauHoraire() {
		return creneauHoraire;
	}

	public void setCreneauHoraire(CreneauHoraire creneauHoraire) {
		this.creneauHoraire = creneauHoraire;
	}

	@Override
	public String toString() {
		return "Livraison [id=" + id + ", client=" + client + ", modeLivraison=" + modeLivraison + ", jour=" + jour
				+ ", creneauHoraire=" + creneauHoraire + "]";
	}

}
