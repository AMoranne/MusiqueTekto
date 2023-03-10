package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data 	
@Entity
public class Produits {
	@Id @GeneratedValue	
	private Long id;
	private String categorie;
	private String designation;
	private Float prix;
	private String imageurl;
}
