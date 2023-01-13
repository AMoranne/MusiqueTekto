package fr.solutec.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Artiste;

public interface ArtisteRepository extends CrudRepository <Artiste, Long> {

	public List<Artiste> findByNom(String nom);

}
