package fr.solutec.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data 	
@Entity
public class Message {
	@Id @GeneratedValue	
	private Long id;
	private String contenu;
	private Date created_date;
	
	@ManyToOne @OnDelete(action = OnDeleteAction.CASCADE)
	private User user;
	@ManyToOne
	private User destinataire;
}
