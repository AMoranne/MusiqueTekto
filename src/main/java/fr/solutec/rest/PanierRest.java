package fr.solutec.rest;

import java.util.List;
import java.util.Optional;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Panier;

import fr.solutec.entities.Produits;
import fr.solutec.repository.PanierRepository;



@RestController @CrossOrigin("*")
public class PanierRest {
	
	@Autowired
	private PanierRepository panierRepos;
	
	@GetMapping("panier/{id}")
	public Optional<Panier> getById(@PathVariable Long id) {
		return panierRepos.findById(id);
	}
	
	@GetMapping("panier/produit/{produits_id}")
	public List<Panier> GetByProduits_id(@PathVariable Long produits_id) {   
		return panierRepos.findByProduits_id(produits_id);
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
