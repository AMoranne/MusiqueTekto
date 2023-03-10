package fr.solutec.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import fr.solutec.entities.Message;

public interface MessageRepository extends CrudRepository <Message, Long> {
	public List<Message> findByUser_id(Long user_id);
	public List<Message> findByUser_idAndDestinataire_id(Long user_id, Long destinataire_id);

}
