package com.company.katadelivrery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.katadelivrery.entity.Client;
import com.company.katadelivrery.entity.CreneauHoraire;
import com.company.katadelivrery.entity.Commande;
import com.company.katadelivrery.entity.ModeLivraison;

@Service
public interface DelivreryService {

	Client getClientById(Long clientId);

	List<ModeLivraison> getAllModeLivraison();

	List<CreneauHoraire> getCreneauHorairesByModeLivraisonId(Long modeLivraisonId);

	Commande saveCommande(Commande livraison);

}
