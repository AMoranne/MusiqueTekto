package fr.solutec.rest;



import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.User;

import fr.solutec.repository.UserRepository;


@RestController @CrossOrigin("*")
public class UserRest {
	
	@Autowired
	private UserRepository userRepos;
	
	@PostMapping("login")   
	public User connexionUser(@RequestBody User user) {
		if (user != null) {
			return userRepos.findByLoginAndPassword(user.getLogin(), user.getPassword());
		}
		else {
			return null;
		}	
	}
	



	
	@GetMapping("user/{id}")
	public Optional<User> getById(@PathVariable Long id) {
		return userRepos.findById(id);
	}
	@GetMapping("user/login/{login}")
	public List<User> getByNom(@PathVariable String login) {
		return userRepos.findByLogin(login);
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
	
	@PostMapping("user")
	public User savePerson(@RequestBody User u) {
		return userRepos.save(u);

	}
	
	@PatchMapping("user/{id}")
	public User mofifPerson(@RequestBody User u,@PathVariable Long id ) {
		u.setId(id);
		return userRepos.save(u);
	
	}
	
	@DeleteMapping("/user/delete/{id}") @OnDelete(action = OnDeleteAction.CASCADE)
	public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
	    if (!userRepos.existsById(id)) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	    userRepos.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}