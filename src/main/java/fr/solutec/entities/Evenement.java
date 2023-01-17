package fr.solutec.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data 	
@Entity
public class Evenement {
	@Id @GeneratedValue							
	private Long id;
	
	private String nom;
	private Float prix;
	
	private String resume;
	
	@Column(columnDefinition="LONGTEXT")
	private String description;
	
	private String date;
	private String image_mini;
	private String image_carousel;
	private String horaire;
	
	@ManyToOne
	private Lieu lieu;
	@ManyToOne 
	private Artiste artiste;
}
