package fr.solutec.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Artiste;
import fr.solutec.repository.ArtisteRepository;

@RestController @CrossOrigin("*")
public class ArtisteRest {

	@Autowired
	private ArtisteRepository artisteRepo;
	
	@GetMapping("artiste/{id}")
	public Optional<Artiste> getById(@PathVariable Long id) {
		return artisteRepo.findById(id);
	}
	@GetMapping("artiste/nom/{nom}")
	public List<Artiste> getByNom(@PathVariable String nom){
		return artisteRepo.findByNom(nom);
	}
	@PostMapping("artiste/{id}")
	public Artiste createArtiste(@RequestBody Artiste a) {
		return artisteRepo.save(a);	
	}
	
	@PutMapping("artiste/{id}")
	public Artiste modifArtiste(@RequestBody Artiste a, @PathVariable Long id) {
		a.setId(id);
		return artisteRepo.save(a);
	}
	
}
