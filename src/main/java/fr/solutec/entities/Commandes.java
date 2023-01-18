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
public class Commandes {
	@Id @GeneratedValue	
	private Long id;
	
	private String adresse_livraison;
	
	@ManyToOne @OnDelete(action = OnDeleteAction.CASCADE)
	private User user;
}
