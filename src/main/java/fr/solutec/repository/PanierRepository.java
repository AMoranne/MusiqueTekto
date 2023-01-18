package fr.solutec.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import fr.solutec.entities.Panier;


public interface PanierRepository extends CrudRepository <Panier, Long> {
	
	public List<Panier> findByProduits_id(Long produits_id);
	

}
	
	
