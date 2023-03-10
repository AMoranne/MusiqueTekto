package fr.solutec.rest;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	@GetMapping("panier/user/{user_id}")
	public List<Panier> getByUser_id(@PathVariable Long user_id) {
		return panierRepos.findByUser_id(user_id);
	}
	
	@GetMapping("panier/produit/{produits_id}/{user_id}")
	public List<Panier> GetByProduits_idAndUser_id(@PathVariable Long produits_id, @PathVariable Long user_id) {   
		return panierRepos.findByProduits_idAndUser_id(produits_id, user_id);
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
	
	@DeleteMapping("/panier/delete/{id}")
	public ResponseEntity<Void> deletePanier(@PathVariable Long id) {
	    if (!panierRepos.existsById(id)) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    panierRepos.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	
	    
	    

	

	
	
	

}
