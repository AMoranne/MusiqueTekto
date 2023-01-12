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
public class Commentaires {
	@Id @GeneratedValue							
	private Long id;
	
	String contenu;
	@ManyToOne
	private Evenement evenement;
	@ManyToOne
	private User user;
}
