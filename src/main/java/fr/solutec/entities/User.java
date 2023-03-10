package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data 	
@Entity
public class User {
	
	@Id @GeneratedValue							
	private Long id;
	
	private String login;
	private String password;
	private String nom;
	private String prenom;
	private String mail;
	private String adresse;
	private String code_Postale;
	
	@Lob
	private byte[] img;
	
	
	
}