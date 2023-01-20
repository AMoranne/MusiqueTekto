package fr.solutec.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data 	
@Entity
public class Morceau {
	@Id @GeneratedValue	
	private Long id;
	private int like1;
	private String album;

	private String auteur;
	private String genre;

	private String nom;
	
	private String url;
}
