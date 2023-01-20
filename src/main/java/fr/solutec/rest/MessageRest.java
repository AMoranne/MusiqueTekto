package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Message;
import fr.solutec.repository.MessageRepository;

@RestController @CrossOrigin("*")
public class MessageRest {

	@Autowired
	private MessageRepository messageRepo;
	
	@GetMapping("messages/user/{user_id}") // retrouver les messages de l'user
	public List<Message> getById(@PathVariable Long user_id) {    
		return messageRepo.findByUser_id(user_id);
	}
	
	@GetMapping("messages/user/{user_id}/{destinataire_id}")
	public List<Message> GetByUser_idAndDestinataire_id(@PathVariable Long user_id, @PathVariable Long destinataire_id) {   
		return messageRepo.findByUser_idAndDestinataire_id(user_id, destinataire_id);
	}
}
