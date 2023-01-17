package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Panier;
import fr.solutec.repository.PanierRepository;



@RestController @CrossOrigin("*")
public class PanierRest {
	
	@Autowired
	private PanierRepository panierRepos;
	
	@GetMapping("panier/{id}")
	public Optional<Panier> getById(@PathVariable Long id) {
		return panierRepos.findById(id);
	}
	
	@GetMapping("panier")                                 
	public Iterable<Panier> getAllPanier() {
		return panierRepos.findAll();
	}
	
	@PutMapping("panier/{id}")
	public Panier modifPanier(@RequestBody Panier p, @PathVariable Long id) {
		p.setId(id);
		return panierRepos.save(p);
	}
	
	
	

}
