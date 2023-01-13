package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Morceau;

public interface MorceauRepository extends CrudRepository <Morceau, Long> {

}
