package com.company.katadelivrery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.katadelivrery.entity.Client;
import com.company.katadelivrery.entity.Commande;
import com.company.katadelivrery.entity.CreneauHoraire;
import com.company.katadelivrery.entity.ModeLivraison;
import com.company.katadelivrery.service.DelivreryService;

@RestController
@RequestMapping("/api/delivrery")
public class DelivreryControleur {

	@Autowired
	private DelivreryService delivreryService;

	/**
	 * Api à appeler pour récupérer un client à partir de son id via l'url
	 * .../api/delivrery/getClientById/{clientId}
	 * 
	 * @param clientId
	 * @return Client trouvé
	 */
	@GetMapping(value = "/getClientById/{clientId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Client> getClientById(@PathVariable Long clientId) {
		Client client = delivreryService.getClientById(clientId);
		return ResponseEntity.ok(client);
	}

	/**
	 * Api à appeler pour récupérer tous les modes de livraison dans la base via
	 * l'url .../api/delivrery/getAllModeLivraison
	 * 
	 * @return liste de tous mode de livraison dans la base
	 */
	@GetMapping(value = "/getAllModeLivraison", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ModeLivraison>> getAllModeLivraison() {
		List<ModeLivraison> modeLivraisonList = delivreryService.getAllModeLivraison();
		return ResponseEntity.ok(modeLivraisonList);
	}

	/**
	 * Api à appeler pour récupérer tous les créneaux horaires en fonction du mode
	 * de livraison selectionné via l'url .../api/delivrery/getAllModeLivraison
	 * 
	 * @param modeLivraisonId
	 * @return
	 */
	@GetMapping(value = "/getCreneauHorairesByModeLivraisonId/{modeLivraisonId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CreneauHoraire>> getCreneauHorairesByModeLivraisonId(
			@PathVariable Long modeLivraisonId) {
		List<CreneauHoraire> creneauHoraireList = delivreryService.getCreneauHorairesByModeLivraisonId(modeLivraisonId);
		return ResponseEntity.ok(creneauHoraireList);
	}

	/**
	 * Sauvegarde de la commande d'un client en fonction des données renseignés dans
	 * l'objet commande
	 * 
	 * @param commande
	 * @return commande sauvegardé contenant l'id dans la base
	 */
	@PostMapping(value = "/saveCommande", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Commande> saveCommande(@RequestBody Commande commande) {
		Commande commandeSaved = delivreryService.saveCommande(commande);
		return ResponseEntity.ok(commandeSaved);
	}

}
