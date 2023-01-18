package fr.solutec.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.solutec.entities.Image;


@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{
	
	Optional<Image> findByName(String name);

}
