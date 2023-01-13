package fr.solutec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import fr.solutec.entities.Artiste;
import fr.solutec.entities.Commandes;
import fr.solutec.entities.Commentaires;
import fr.solutec.entities.Evenement;
import fr.solutec.entities.Lieu;
import fr.solutec.entities.Message;
import fr.solutec.entities.Morceau;
import fr.solutec.entities.Panier;
import fr.solutec.entities.Playlist;
import fr.solutec.entities.Produits;
import fr.solutec.entities.User;
import fr.solutec.repository.ArtisteRepository;
import fr.solutec.repository.CommandesRepository;
import fr.solutec.repository.CommentairesRepository;
import fr.solutec.repository.EvenementRepository;
import fr.solutec.repository.LieuRepository;
import fr.solutec.repository.MessageRepository;
import fr.solutec.repository.MorceauRepository;
import fr.solutec.repository.PanierRepository;
import fr.solutec.repository.PlaylistRepository;
import fr.solutec.repository.ProduitsRepository;
import fr.solutec.repository.UserRepository;

@SpringBootApplication
public class MusiqueTektoApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private ArtisteRepository artisteRepo;
	@Autowired
	private CommandesRepository commandesRepo;
	@Autowired
	private CommentairesRepository commentairesRepo;
	@Autowired
	private EvenementRepository evenementRepo;
	@Autowired
	private LieuRepository lieuRepo;
	@Autowired
	private MessageRepository messageRepo;
	@Autowired
	private MorceauRepository morceauRepo;
	@Autowired
	private PanierRepository panierRepo;
	@Autowired
	private PlaylistRepository playlistRepo;
	@Autowired
	private ProduitsRepository produitsRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(MusiqueTektoApplication.class, args);
		System.out.println("lancement terminé");
	}
	
	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Test", "Test", "Test", "Test", "Test");
		User u2 = new User(null, "LOL", "Test", "Test", "Test", "Test");
		userRepo.save(u1);
		userRepo.save(u2);
		Commandes c1 = new Commandes(null,"Test",u1);
		Commandes c2 = new Commandes(null,"Test",u2);
		commandesRepo.save(c1);
		commandesRepo.save(c2);
		Artiste a1 = new Artiste(null,"A1","A2",3,true,"A3","A4");
		Artiste a2 = new Artiste(null,"A5","A6",3,true,"A7","A8");
		artisteRepo.save(a1);
		artisteRepo.save(a2);
		Lieu l1 = new Lieu(null,"L1","L2",314);
		Lieu l2 = new Lieu(null,"L1","L2",314);
		lieuRepo.save(l1);
		lieuRepo.save(l2);
		Evenement e1 = new Evenement(null,"E1",(float) 314,l1,a1);
		Evenement e2 = new Evenement(null,"E2",(float) 315,l2,a2);
		evenementRepo.save(e1);
		evenementRepo.save(e2);
		Commentaires co1 = new Commentaires(null,"C1",e1,u1);
		Commentaires co2 = new Commentaires(null,"C2",e2,u2);
		commentairesRepo.save(co1);
		commentairesRepo.save(co2);
		Message m1 = new Message(null,"wesh alors1");
		Message m2 = new Message(null,"wesh alors2");
		messageRepo.save(m1);
		messageRepo.save(m2);
		Morceau mo1 = new Morceau(null,"M1","M2","M3","M4");
		Morceau mo2 = new Morceau(null,"M5","M6","M7","M8");
		morceauRepo.save(mo1);
		morceauRepo.save(mo2);
		Produits po1 = new Produits(null,"P1","C1",(float)314);
		Produits po2 = new Produits(null,"P2","C2",(float)315);
		produitsRepo.save(po1);
		produitsRepo.save(po2);
		Panier p1 = new Panier(null,314,c1,po1);
		Panier p2 = new Panier(null,315,c2,po2);
		panierRepo.save(p1);
		panierRepo.save(p2);
		Playlist pl1 = new Playlist(null);
		Playlist pl2 = new Playlist(null);
		playlistRepo.save(pl1);
		playlistRepo.save(pl2);
	}
}
