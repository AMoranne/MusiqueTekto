package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Commandes;


public interface CommandesRepository extends CrudRepository<Commandes, Long>{

}
