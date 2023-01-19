package fr.solutec.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import fr.solutec.entities.Panier;

@Repository
public interface PanierRepository extends JpaRepository <Panier, Long> {
	
	public List<Panier> findByProduits_idAndUser_id(Long produits_id, Long user_id);
	

}
	
	
