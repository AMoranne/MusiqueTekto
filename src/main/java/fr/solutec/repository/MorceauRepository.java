package fr.solutec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import fr.solutec.entities.Morceau;

@Repository
public interface MorceauRepository extends JpaRepository <Morceau, Long> {

}
