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

import fr.solutec.entities.User;

import fr.solutec.repository.UserRepository;


@RestController @CrossOrigin("*")
public class UserRest {
	
	@Autowired
	private UserRepository userRepos;
	
	
	@GetMapping("user/{id}")
	public Optional<User> getById(@PathVariable Long id) {
		return userRepos.findById(id);
	}
	@GetMapping("user/nom/{nom}")
	public List<User> getByNom(@PathVariable String nom) {
		return userRepos.findByNom(nom);
	}
	
	/*@PutMapping("user/{nom}")
	public User modifPerson(@RequestBody User u, @PathVariable String nom) {
		u.setNom(nom);
		return userRepos.save(u);
	}*/
	@PutMapping("user/{id}")
	public User modifPerson(@RequestBody User u, @PathVariable Long id) {
		u.setId(id);
		return userRepos.save(u);
	}
}