package fr.solutec.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
	public List<User> findByNom(String nom);
	public List<User> findByLogin(String login);
}