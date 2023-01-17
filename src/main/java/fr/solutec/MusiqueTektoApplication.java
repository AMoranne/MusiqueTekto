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

		User u1 = new User(null, "U1", "U2", "U3", "U4", "U5", "10 rue machin", "45000");
		User u2 = new User(null, "U6", "U7", "U8", "U9", "U10", "25 avenue de truc", "87999");
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
		Evenement e1 = new Evenement(null,"RAP CONTENDERS",(float) 20,"EVENEMENT RAP : Préparez vous !!","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.","24-03-2023","https://res.cloudinary.com/de1leytbf/image/upload/v1673948760/samples/project/hip-hop-musicien_xhwa0i_w3yhjb.jpg","#","19h-21h",l1,a1);
		Evenement e2 = new Evenement(null,"REGGAEMUZZ V1",(float) 25,"EVENEMENT REGGAETON : Préparez vous!!","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.","25-03-2023","https://res.cloudinary.com/de1leytbf/image/upload/c_crop,g_south_west,h_500,w_500/v1673947662/samples/project/rasta-reggae-music-jama_C3_AFque_vcsezu.jpg","https://res.cloudinary.com/de1leytbf/image/upload/c_crop,g_south_west,h_227,w_605,y_0/v1673947662/samples/project/rasta-reggae-music-jama_C3_AFque_vcsezu.jpg","21h-23h",l2,a2);
		Evenement e3 = new Evenement(null,"80S OLD SCHOOL",(float) 25,"EVENEMENT HIP HOP ET AFROBEAT : Préparez vous!!","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.","14-04-2023","https://res.cloudinary.com/de1leytbf/image/upload/c_crop,g_east,h_918,w_918/v1673950200/samples/project/photo-1485579149621-3123dd979885_b2djob.jpg","https://res.cloudinary.com/de1leytbf/image/upload/c_crop,h_765,w_1631/v1673950200/samples/project/photo-1485579149621-3123dd979885_b2djob.jpg","19h-21h",l2,a2);
		Evenement e4 = new Evenement(null,"CLASSIKO",(float) 25,"EVENEMENT ORCHESTRE SYMPHONIQUE : Préparez vous!!","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.","22-04-2023","https://res.cloudinary.com/de1leytbf/image/upload/c_crop,h_980,w_980/v1673950594/samples/project/photo-1433622070098-754fdf81c929_nvvpp3.jpg","https://res.cloudinary.com/de1leytbf/image/upload/c_crop,g_south_west,h_689,w_1470/v1673950594/samples/project/photo-1433622070098-754fdf81c929_nvvpp3.jpg","20h30-22h",l2,null);
		Evenement e5 = new Evenement(null,"REGGAEMUZZ V2",(float) 25,"EVENEMENT REGGAETON : Préparez vous!!","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.","22-04-2023","https://res.cloudinary.com/de1leytbf/image/upload/c_crop,g_south_west,h_500,w_500/v1673947662/samples/project/rasta-reggae-music-jama_C3_AFque_vcsezu.jpg","https://res.cloudinary.com/de1leytbf/image/upload/c_crop,g_south_west,h_227,w_605,y_0/v1673947662/samples/project/rasta-reggae-music-jama_C3_AFque_vcsezu.jpg","21h-23h",l2,a1);
		Evenement e6 = new Evenement(null,"REGGAEMUZZ V3",(float) 25,"EVENEMENT REGGAETON : Préparez vous!!","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.","27-05-2023","https://res.cloudinary.com/de1leytbf/image/upload/c_crop,g_south_west,h_500,w_500/v1673947662/samples/project/rasta-reggae-music-jama_C3_AFque_vcsezu.jpg","https://res.cloudinary.com/de1leytbf/image/upload/c_crop,g_south_west,h_227,w_605,y_0/v1673947662/samples/project/rasta-reggae-music-jama_C3_AFque_vcsezu.jpg","21h-23h",l2,a2);
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
		Morceau mo3 = new Morceau(null,"M9","M10","M11","M12");
		Morceau mo4 = new Morceau(null,"M13","M14","M15","M16");
		Morceau mo5 = new Morceau(null,"M17","M18","M19","M20");
		Morceau mo6 = new Morceau(null,"M21","M22","M23","M24");
		Morceau mo7 = new Morceau(null,"M25","M26","M27","M28");
		morceauRepo.save(mo1);
		morceauRepo.save(mo2);
		morceauRepo.save(mo3);
		morceauRepo.save(mo4);
		morceauRepo.save(mo5);
		morceauRepo.save(mo6);
		morceauRepo.save(mo7);
		Produits po1 = new Produits(null,"P1","C1",(float)10);
		Produits po2 = new Produits(null,"P2","C2",(float)20);
		Produits po3 = new Produits(null,"P3","C3",(float)30);
		Produits po4 = new Produits(null,"P4","C4",(float)40);
		produitsRepo.save(po1);
		produitsRepo.save(po2);
		produitsRepo.save(po3);
		produitsRepo.save(po4);
		Panier p1 = new Panier(null,5,c1,po1);
		Panier p2 = new Panier(null,3,c2,po2);
		panierRepo.save(p1);
		panierRepo.save(p2);
		Playlist pl1 = new Playlist(null,u1,mo1);
		Playlist pl2 = new Playlist(null,u1,mo2);
		Playlist pl3 = new Playlist(null,u1,mo3);
		Playlist pl4 = new Playlist(null,u1,mo4);
		Playlist pl5 = new Playlist(null,u1,mo5);
		Playlist pl6 = new Playlist(null,u2,mo6);
		Playlist pl7 = new Playlist(null,u2,mo7);
		playlistRepo.save(pl1);
		playlistRepo.save(pl2);
		playlistRepo.save(pl3);
		playlistRepo.save(pl4);
		playlistRepo.save(pl5);
		playlistRepo.save(pl6);
		playlistRepo.save(pl7);
		
	}
}
