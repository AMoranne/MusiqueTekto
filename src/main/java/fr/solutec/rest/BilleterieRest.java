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
	
	@GetMapping("billeterie/evenement/{evenement_id}")
	public List<Billeterie> GetByEvenement_idAndUser_id(@PathVariable Long evenement_id, @PathVariable Long user_id) {   
		return billeterieRepos.findByEvenement_idAndUser_id(evenement_id, user_id);
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
	
	@DeleteMapping("/billeterie/delete/{id}")
	public ResponseEntity<Void> deleteBilleterie(@PathVariable Long id) {
	    if (!billeterieRepos.existsById(id)) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    billeterieRepos.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
