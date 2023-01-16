package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data 	
@Entity
public class Playlist {
	@Id @GeneratedValue	
	private Long id;
	private String nom;
	@ManyToOne
	private Morceau morceau1;
	@ManyToOne
	private Morceau morceau2;
	@ManyToOne
	private Morceau morceau3;
	@ManyToOne
	private Morceau morceau4;
	@ManyToOne
	private Morceau morceau5;
	@ManyToOne
	private Morceau morceau6;
	@ManyToOne
	private Morceau morceau7;
	@ManyToOne
	private Morceau morceau8;
	@ManyToOne
	private Morceau morceau9;
	@ManyToOne
	private Morceau morceau10;
}
