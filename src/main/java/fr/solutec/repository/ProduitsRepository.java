package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Produits;

public interface ProduitsRepository extends CrudRepository <Produits, Long> {

}
