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
public class Billeterie {
	
	@Id @GeneratedValue	
	private Long id;
	private int quantite;
	
	@ManyToOne
	private Evenement evenement;
	
	@ManyToOne @OnDelete(action = OnDeleteAction.CASCADE)
	private User user;
	
	
}

