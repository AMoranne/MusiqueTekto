package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data 	//Crée les constructeurs sans et avec arguments, puis les getter et setter.
@Entity
public class User {
	
	@Id @GeneratedValue							//Le id met la ligne suivante en primary key, le GeneratedValue met en auto Increment
	private Long id;
	
	private String login;
	private String password;
	private String nom;
	private String prenom;
	private String mail;
}