package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.repository.MorceauRepository;
import fr.solutec.entities.Morceau;

@RestController @CrossOrigin("*")
public class MorceauRest {
	@Autowired
	private MorceauRepository morceauRepo;
	
	@GetMapping("morceau/{id}")
	public Optional<Morceau> getById(@PathVariable Long id) {
		return morceauRepo.findById(id);
	}
	@GetMapping("morceau")                                 
	public Iterable<Morceau> getAllPanier() {
		return morceauRepo.findAll();
	}
}
