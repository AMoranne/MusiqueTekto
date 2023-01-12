package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data 	
@Entity
public class Artiste {
	@Id @GeneratedValue							
	private Long id;
	private String nom;
	private String mail;
	private int siret;
	private boolean societe;
	private String login;
	private String password;
}
