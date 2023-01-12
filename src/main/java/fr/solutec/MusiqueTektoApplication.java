package fr.solutec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.User;
import fr.solutec.repository.UserRepository;

@SpringBootApplication
public class MusiqueTektoApplication {
	@Autowired
	private UserRepository userRepo;
	public static void main(String[] args) {
		SpringApplication.run(MusiqueTektoApplication.class, args);
		System.out.println("lancement terminé");
	}
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Test", "Test", "Test", "Test", "Test", "Test");
		userRepo.save(u1);
		
	}
}
