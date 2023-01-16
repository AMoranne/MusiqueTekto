package fr.solutec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.solutec.entities.Playlist;

@Repository
public interface PlaylistRepository extends JpaRepository <Playlist, Long> {

}
