package fr.solutec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import fr.solutec.entities.User;
import fr.solutec.repository.UserRepository;

@SpringBootApplication
public class MusiqueTektoApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepo;
	public static void main(String[] args) {
		SpringApplication.run(MusiqueTektoApplication.class, args);
		System.out.println("lancement terminé");
	}
	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Test", "Test", "Test", "Test", "Test");
		User u2 = new User(null, "Test", "Test", "Test", "Test", "Test");
		userRepo.save(u1);
		userRepo.save(u2);
		
	}
}
