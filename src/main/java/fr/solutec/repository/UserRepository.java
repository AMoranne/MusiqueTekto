package fr.solutec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.solutec.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public List<User> findByNom(String nom);


	public User findByLoginAndPassword(String login, String password);

	public List<User> findByLogin(String login);
	


}