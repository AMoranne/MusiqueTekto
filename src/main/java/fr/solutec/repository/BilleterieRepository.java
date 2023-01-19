package fr.solutec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.solutec.entities.Billeterie;


public interface BilleterieRepository extends JpaRepository <Billeterie, Long> { 
	
	public List<Billeterie> findByEvenement_idAndUser_id(Long evenement_id, Long user_id);
	public List<Billeterie> findByUser_id(Long user_id);

}
