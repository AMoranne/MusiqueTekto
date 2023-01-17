package fr.solutec.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import fr.solutec.entities.Billeterie;


public interface BilleterieRepository extends CrudRepository <Billeterie, Long> { 
	
	public List<Billeterie> findByEvenements_id(Long evenements_id);

}
