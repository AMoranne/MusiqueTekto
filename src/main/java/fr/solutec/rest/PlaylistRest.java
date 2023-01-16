package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Playlist;
import fr.solutec.repository.PlaylistRepository;

@RestController @CrossOrigin("*")
public class PlaylistRest {
	
	@Autowired
	private PlaylistRepository playlistRepo;
	
	
	@GetMapping("playlist/{id}")
	public Optional<Playlist> getById(@PathVariable Long id) {
		return playlistRepo.findById(id);
	}
	@GetMapping("playlist")                                 
	public Iterable<Playlist> getAllPanier() {
		return playlistRepo.findAll();
	}
}
