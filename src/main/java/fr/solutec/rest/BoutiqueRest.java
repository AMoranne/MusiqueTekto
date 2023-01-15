package fr.solutec.rest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import fr.solutec.entities.Produits;

import fr.solutec.repository.BoutiqueRepository;

@RestController @CrossOrigin("*")
public class BoutiqueRest {

	
	@Autowired
	private BoutiqueRepository boutiqueRepo;
	
	@GetMapping("produits/{designation}")// retrouver un produit par son nom
	public List<Produits> getByDesignation(@PathVariable String designation){
		return boutiqueRepo.findByDesignation(designation);
		}
	
	@GetMapping("produits/all")// retrouver tous les produits
	public Iterable<Produits> getAllProduits(){
		return boutiqueRepo.findAll();
	}	
	

	
}
