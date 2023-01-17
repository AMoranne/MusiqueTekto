package fr.solutec.rest;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Billeterie;

import fr.solutec.repository.BilleterieRepository;


@RestController @CrossOrigin("*")
public class BilleterieRest {
	
	@Autowired
	private BilleterieRepository billeterieRepos;
	
	@GetMapping("billeterie/{id}")
	public Optional<Billeterie> getById(@PathVariable Long id) {
		return billeterieRepos.findById(id);
	}
	
	@GetMapping("billeterie/evenement/{evenements_id}")
	public List<Billeterie> GetByEvenements_id(@PathVariable Long evenements_id) {   
		return billeterieRepos.findByEvenements_id(evenements_id);
	}
	
	@GetMapping("billeterie")                                 
	public Iterable<Billeterie> getAllBilleterie() {
		return billeterieRepos.findAll();
	}
	
	@PutMapping("billeterie/{id}")
	public Billeterie modifBilleterie(@RequestBody Billeterie b, @PathVariable Long id) {
		b.setId(id);
		return billeterieRepos.save(b);
	}

}
