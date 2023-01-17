package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Morceau;
import fr.solutec.entities.Playlist;
import fr.solutec.entities.User;
import fr.solutec.repository.MorceauRepository;
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
	
	@DeleteMapping("/playlist/delete/{id}")
	public ResponseEntity<Void> deletePlaylist(@PathVariable Long id) {
	    if (!playlistRepo.existsById(id)) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	    playlistRepo.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	@PutMapping("playlist/add/{id}")
	public Playlist modifPlaylist(@RequestBody Playlist pl, @PathVariable Long id) {
		pl.setId(id);
		return playlistRepo.save(pl);
	}
}
