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

		User u1 = new User(null, "U1", "U2", "U3", "U4", "U5");
		User u2 = new User(null, "U6", "U7", "U8", "U9", "U10");
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
		Evenement e1 = new Evenement(null,"RAP CONTENDERS",(float) 20,"EVENEMENT RAP : Préparez vous !!","The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.","05-05-2023","https://images.unsplash.com/photo-1499415479124-43c32433a620?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1932&q=80",l1,a1);
		Evenement e2 = new Evenement(null,"REGGAEMUZZ V1",(float) 25,"EVENEMENT REGGAETON : Préparaez vous!!","The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.","05-05-2023","https://images.unsplash.com/photo-1499415479124-43c32433a620?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1932&q=80",l2,a2);
		Evenement e3 = new Evenement(null,"95S OLD SCHOOL",(float) 25,"EVENEMENT HIP HOP ET AFROBEAT : Préparez vous!!","The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.","05-05-2023","https://images.unsplash.com/photo-1485579149621-3123dd979885?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1631&q=80",l2,a2);
		Evenement e4 = new Evenement(null,"CLASSIKO",(float) 25,"EVENEMENT ORCHESTRE SYMPHONIQUE : Préparez vous!!","The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.","05-05-2023","https://images.unsplash.com/photo-1433622070098-754fdf81c929?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1470&q=80",l2,null);
		Evenement e5 = new Evenement(null,"REGGAEMUZZ V2",(float) 25,"EVENEMENT REGGAETON : Préparez vous!!","The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.","05-05-2023","https://images.unsplash.com/photo-1499415479124-43c32433a620?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1932&q=80",l2,a1);
		Evenement e6 = new Evenement(null,"REGGAEMUZZ V3",(float) 25,"EVENEMENT REGGAETON : Préparez vous!!","The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.","05-05-2023","https://images.unsplash.com/photo-1499415479124-43c32433a620?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1932&q=80",l2,a2);
		evenementRepo.save(e1);
		evenementRepo.save(e2);
		evenementRepo.save(e3);
		evenementRepo.save(e4);
		evenementRepo.save(e5);
		evenementRepo.save(e6);
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
		//produits
		Produits po1 = new Produits(null,"P1","C1",(float)314);
		Produits po2 = new Produits(null,"P2","C2",(float)315);
		Produits po3 = new Produits(null,"P3","C3",(float)314);
		Produits po4 = new Produits(null,"P4","C4",(float)315);
		produitsRepo.save(po1);
		produitsRepo.save(po2);
		produitsRepo.save(po3);
		produitsRepo.save(po4);
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
