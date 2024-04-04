package com.company.katadelivrery.service.impl;

import java.util.List;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.katadelivrery.entity.Client;
import com.company.katadelivrery.entity.CreneauHoraire;
import com.company.katadelivrery.entity.Commande;
import com.company.katadelivrery.entity.ModeLivraison;
import com.company.katadelivrery.repository.ClientRepository;
import com.company.katadelivrery.repository.CreneauHoraireRepository;
import com.company.katadelivrery.repository.CommandeRepository;
import com.company.katadelivrery.repository.ModeLivraisonRepository;
import com.company.katadelivrery.service.DelivreryService;

@Service
public class DelivreryServiceImpl implements DelivreryService {

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private ModeLivraisonRepository modeLivraisonRepository;

	@Autowired
	private CreneauHoraireRepository creneauHoraireRepository;

	@Autowired
	private CommandeRepository commandeRepository;

	@Override
	public Client getClientById(Long clientId) {
		return clientRepository.findById(clientId).orElse(null);
	}

	@Override
	public List<ModeLivraison> getAllModeLivraison() {
		return IterableUtils.toList(modeLivraisonRepository.findAll());
	}

	@Override
	public List<CreneauHoraire> getCreneauHorairesByModeLivraisonId(Long modeLivraisonId) {
		return creneauHoraireRepository.findByModeLivraisonId(modeLivraisonId);
	}

	@Override
	public Commande saveCommande(Commande commande) {
		return commandeRepository.save(commande);
	}

}
