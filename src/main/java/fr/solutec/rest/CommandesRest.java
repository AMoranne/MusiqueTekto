package fr.solutec.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Commandes;

import fr.solutec.repository.CommandesRepository;





import org.springframework.beans.factory.annotation.Autowired;


@RestController 
public class CommandesRest {
	
	@Autowired
	private CommandesRepository commandesRepo;
	
	@PutMapping("commande/{id}")
	public Commandes modifCommande(@RequestBody Commandes c, @PathVariable Long id) {
		c.setId(id);
		return commandesRepo.save(c);
	}
	
	@GetMapping("commande")                                 
	public Iterable<Commandes> getAllCommandes() {
		return commandesRepo.findAll();
	}
	
	

}
