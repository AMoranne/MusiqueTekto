package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Artiste;

public interface ArtisteRepository extends CrudRepository <Artiste, Long> {

}
