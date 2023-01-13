package fr.solutec.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import fr.solutec.entities.Produits;

public interface BoutiqueRepository extends CrudRepository <Produits, String>{

	public List<Produits> findByDesignation(String designation);
}
