package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Playlist;

public interface PlaylistRepository extends CrudRepository <Playlist, Long> {

}
