package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data 	
@Entity
public class Playlist {
	@Id @GeneratedValue	
	private Long id;
	@ManyToOne @OnDelete(action = OnDeleteAction.CASCADE)
	private User user;
	@ManyToOne
	private Morceau morceau;
}
