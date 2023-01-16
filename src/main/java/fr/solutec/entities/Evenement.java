package fr.solutec.entities;

import java.time.LocalDate;

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
	
	private String description;
	private String date;
	private String image;
	
	@ManyToOne
	private Lieu lieu;
	@ManyToOne 
	private Artiste artiste;
}
