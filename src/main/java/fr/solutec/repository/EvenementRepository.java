package fr.solutec.repository;

import java.util.List;



import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Evenement;
public interface EvenementRepository extends CrudRepository <Evenement, Long> {
	public List<Evenement> findByNom(String nom);
	public List<Evenement> findByArtiste_nom(String artiste_nom);
}
