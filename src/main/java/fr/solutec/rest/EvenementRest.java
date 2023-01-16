package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Evenement;
import fr.solutec.repository.EvenementRepository;

@RestController @CrossOrigin("*")
public class EvenementRest {

	@Autowired
	private EvenementRepository evenementRepo;
	
	@GetMapping("evenement/nom/{nom}") // retrouver un évènement par son nom
	public List<Evenement> getByNom(@PathVariable String nom){
		return evenementRepo.findByNom(nom);
	}
	
	@GetMapping("evenement/all") // retrouver tous les évènements
	public Iterable<Evenement> getAllEvenement(){
		return evenementRepo.findAll();
	}
	
	@GetMapping("evenement/artiste/{artiste_nom}") // retrouver les évènements par nom de l'artiste
	public List<Evenement> getByArtiste(@PathVariable String artiste_nom) {    //Indique que le user_id est une variable de l'URL
		return evenementRepo.findByArtiste_nom(artiste_nom);
	}
	
	
}
