package fr.solutec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Artiste;
import fr.solutec.entities.Billeterie;
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
import fr.solutec.repository.BilleterieRepository;
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
	@Autowired
	private BilleterieRepository billeterieRepo;
	
	/*
	private Map<String, Integer> progress = new HashMap<>();
	
	@Autowired
	private SimpMessageSendingOperations messagingTemplate; */
	
	public static void main(String[] args) {
		SpringApplication.run(MusiqueTektoApplication.class, args);
		System.out.println("lancement terminé");
	}
	
	
	/*
	@Bean
	public CommandLineRunner websocketDemo() {
		return (args) -> {
			while (true) {
				try {
					Thread.sleep(3*1000); // Each 3 sec.
					progress.put("num1", randomWithRange(0, 100));
					progress.put("num2", randomWithRange(0, 100));
					messagingTemplate.convertAndSend("/userc/progress", this.progress);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
	}*/
	
	
	/**
	 * Get a random integer value in a min / max range.
	 * @param min min range value
	 * @param max max range value
	 * @return A random integer value
	 */
	
	/*
	private int randomWithRange(int min, int max)
	{
		int range = Math.abs(max - min) + 1;
		return (int)(Math.random() * range) + (min <= max ? min : max);
	} */

	
	
	
	
	
	
	
	@Override
	public void run(String... args) throws Exception {


		User u1 = new User(null, "login1", "password1", "Tec", "Solu", "prenom1.nom1@gmail.com", "86 Boulevard Haussmann", "75008", null);
		User u2 = new User(null, "login2", "password2", "Ic", "Es", "U10", "36 Avenue Pierre Brossolette", "92240", null);


		

		userRepo.save(u1);
		userRepo.save(u2);

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
		Evenement e3 = new Evenement(null,"80S OLD SCHOOL",(float) 25,"EVENEMENT SOUL : Préparez vous!!","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.","14-04-2023","https://res.cloudinary.com/de1leytbf/image/upload/c_crop,g_east,h_918,w_918/v1673950200/samples/project/photo-1485579149621-3123dd979885_b2djob.jpg","https://res.cloudinary.com/de1leytbf/image/upload/c_crop,h_765,w_1631/v1673950200/samples/project/photo-1485579149621-3123dd979885_b2djob.jpg","19h-21h",l2,a2);
		Evenement e4 = new Evenement(null,"CLASSIKO",(float) 25,"EVENEMENT SYMPHONIQUE : Préparez vous!!","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.","22-04-2023","https://res.cloudinary.com/de1leytbf/image/upload/c_crop,h_980,w_980/v1673950594/samples/project/photo-1433622070098-754fdf81c929_nvvpp3.jpg","https://res.cloudinary.com/de1leytbf/image/upload/c_crop,g_south_west,h_689,w_1470/v1673950594/samples/project/photo-1433622070098-754fdf81c929_nvvpp3.jpg","20h30-22h",l2,null);
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
		Message m1 = new Message(null,"wesh alors1",u1,u2);
		Message m2 = new Message(null,"wesh alors2",u2,u1);
		Message m3 = new Message(null,"wesh alors1",u1,u2);
		Message m4 = new Message(null,"wesh alors2",u2,u1);
		
		messageRepo.save(m1);
		messageRepo.save(m2);

		messageRepo.save(m3);
		messageRepo.save(m4);

		Morceau mo1 = new Morceau(null,"Whenever You Need Somebody","Rick Astley","Pop","Never Gonna Give You Up","assets/audio/Rick Astley - Never Gonna Give You Up (Official Music Video).mp3");
		Morceau mo2 = new Morceau(null,"Hotel California","Eagles","Rock","Hotel California","assets/audio/Hotel California (2013 Remaster).mp3");
		Morceau mo3 = new Morceau(null,"A Night At The Opera","Queen","Rock","Bohemian Rhapsody","assets/audio/Queen – Bohemian Rhapsody (Official Video Remastered).mp3");
		Morceau mo4 = new Morceau(null,"Ghost Stories","Coldplay","Pop","A Sky Full Of Stars","assets/audio/Coldplay - A Sky Full Of Stars (Official Video).mp3");
		Morceau mo5 = new Morceau(null,"Use Your Illusion II","Guns N' Roses","Rock","Knockin' On Heaven's Door","assets/audio/Knockin On Heavens Door.mp3");


		morceauRepo.save(mo1);
		morceauRepo.save(mo2);
		morceauRepo.save(mo3);
		morceauRepo.save(mo4);
		morceauRepo.save(mo5);


		Produits po1 = new Produits(null,"Disques","Whenever You Need Somebody",(float)15,"https://m.media-amazon.com/images/I/61tSfUiQdKL._SY355_.jpg");
		Produits po2 = new Produits(null,"Disques","Hotel California",(float)15,"https://p7.storage.canalblog.com/75/84/636073/127827980_o.jpg");
		Produits po3 = new Produits(null,"Disques","A Night At The Opera",(float)15,"https://textes-blog-rock-n-roll.fr/wp-content/uploads/2020/11/Queen-A-night-at-the-Opera.jpg");
		Produits po4 = new Produits(null,"Disques","Ghost Stories",(float)15,"https://www.dafont.com/forum/attach/orig/4/5/454121.jpg?1");
		Produits po5 = new Produits(null,"Disques","Use Your Illusion II",(float)15,"https://m.media-amazon.com/images/I/71cPYP4T32L._SL1423_.jpg");
		Produits po6 = new Produits(null,"Équipement audio","Casque",(float)150,"https://img.freepik.com/photos-gratuite/appareil-numerique-sans-fil-casque-rose_53876-96804.jpg?w=740&t=st=1673805007~exp=1673805607~hmac=b96d774c41761b16f359e6320d10a1c99ff34459bf8e71ec9ce1f43ab75d8fd7");
		Produits po7 = new Produits(null,"Produits dérivés","Stickers",(float)5,"https://cdn.laredoute.com/products/6/5/a/65a5852d7e623d8730f5023b742a2e21.jpg?imgopt=twic&twic=v1");
		Produits po8 = new Produits(null,"Produits dérivés","Mug",(float)12,"https://i.etsystatic.com/26608127/r/il/199a4a/2816066471/il_794xN.2816066471_hoof.jpg");
		Produits po9 = new Produits(null,"Produits dérivés","T-shirt",(float)40,"https://www.maskperso.shop/wp-content/uploads/2021/07/IMG_8105.jpg");
		Produits po10 = new Produits(null,"Équipement audio","Écouteur Chorus",(float)90,"https://m.media-amazon.com/images/I/51Awouv9lTL._AC_SL1500_.jpg");

		produitsRepo.save(po1);
		produitsRepo.save(po2);
		produitsRepo.save(po3);
		produitsRepo.save(po4);
		produitsRepo.save(po5);
		produitsRepo.save(po6);
		produitsRepo.save(po7);
		produitsRepo.save(po8);
		produitsRepo.save(po9);
		produitsRepo.save(po10);
		
		Playlist pl1 = new Playlist(null,u1,mo1);
		Playlist pl2 = new Playlist(null,u1,mo2);
		Playlist pl3 = new Playlist(null,u1,mo3);
		Playlist pl4 = new Playlist(null,u1,mo4);
		Playlist pl5 = new Playlist(null,u1,mo5);
		playlistRepo.save(pl1);
		playlistRepo.save(pl2);
		playlistRepo.save(pl3);
		playlistRepo.save(pl4);
		playlistRepo.save(pl5);

	}
}
