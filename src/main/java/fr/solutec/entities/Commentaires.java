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
public class Commentaires {
	@Id @GeneratedValue							
	private Long id;
	
	String contenu;
	@ManyToOne
	private Evenement evenement;
	@ManyToOne @OnDelete(action = OnDeleteAction.CASCADE)
	private User user;
}
