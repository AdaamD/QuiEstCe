import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
import java.util.Random;
import java.util.function.Function;


public class Main 

{
		private static final JFrame frame = new JFrame("Qui est ce ??");
		private static final JLabel reponseOui = new JLabel("Oui ", JLabel.CENTER);
		private static final JLabel reponseNon = new JLabel("Non ", JLabel.CENTER);
		private static final JLabel choisissez = new JLabel("Choisissez votre question ", JLabel.CENTER);
		private static void repondreOui(){
			System.out.println("oui");
			reponseOui.setVisible(true);
			reponseNon.setVisible(false);
			choisissez.setVisible(false);
			frame.repaint();
		}
		private static void repondreNon(){
			System.out.println("non");
			reponseNon.setVisible(true);
			reponseOui.setVisible(false);
			choisissez.setVisible(false);
			frame.repaint(); 
		}
		private static <E> void assignerQuestion(JComboBox<E> box, Function<E,Boolean> question){
			box.addActionListener(new ActionListener() {     
				//	@Override
					public void actionPerformed(ActionEvent e) {
		
						if(question.apply((E)box.getSelectedItem()))
						{ repondreOui();
							
						} 
						else {
							repondreNon();
						}
					} 
				});
		}
    // Fonction choix d'un nb aléatoire
	public static  int Choixalea(int nbPersos){
		Random random = new Random();
		int nb_Alea = random.nextInt(nbPersos);
		return nb_Alea;
	}


	public static void main(String[] args) 
	{ 	
		JMenuBar menu = new JMenuBar();						
		JMenu file = new JMenu("Fichier");					
		JMenu edit = new JMenu("Edition");					
		JMenu help = new JMenu("Aide");	
		JMenuItem newf = new JMenuItem("Nouveau");
		//JMenuItem open = new JMenuItem("Ouvrir");
		JMenuItem save = new JMenuItem("Enregistrer");
		JMenuItem quit = new JMenuItem("Quitter");

		frame.add(menu);
		file.add(newf);
		file.add(save);
		file.add(quit);
		quit.addActionListener(e -> { frame.dispose();});

		menu.add(file);
		menu.add(edit);
		menu.add(help);




		JPanel question = new JPanel();
		JPanel reponse =  new JPanel();
		reponse.add(reponseOui);
		reponseOui.setVisible(false);
		reponse.add(reponseNon);
		reponseNon.setVisible(false); 
		reponse.add(choisissez);
		JPanel validation = new JPanel();
		Personnage[] personnages = Jeu.getPersonnages();
		//JLabel label = new JLabel("BIENVENUE SUR QUI-EST-CE?", JLabel.CENTER);
		//frame.add(label);
		Personnage persoChoisi = personnages[Choixalea(personnages.length)];
		JPanel[] panelsPersos = {new JPanel(), new JPanel(), new JPanel(), new JPanel()};
		for (int i = 0 ; i< panelsPersos.length; i++) {
			frame.add(panelsPersos[i]); 
		}
	
		

		


//Creation des ICON de personnages 
ImageIcon croix= new ImageIcon(new ImageIcon(Jeu.getImage("croix.jpg")).getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
		for (int i = 0; i<personnages.length;i++){
			JButton bouton = new JButton(new ImageIcon
				(new ImageIcon(Jeu.getImage(personnages[i].getPhoto())).getImage()
				.getScaledInstance(200,200,Image.SCALE_DEFAULT))); 
			bouton.setBounds(40,80,200,250);
			
			panelsPersos[i/4].add(bouton); 
			bouton.addActionListener(new ActionListener() {     

				public void actionPerformed(ActionEvent e) {
					bouton.setIcon(croix);				
				} 
			}); 
			

		}

		
		frame.setLayout(new GridLayout(8,1));
		
		JComboBox<Nationalite> nationalites = new JComboBox<> (Nationalite.values());
		assignerQuestion(nationalites, n -> n == persoChoisi.getNationalite());
		JComboBox<Sport> sports= new JComboBox<>(Sport.values());
		assignerQuestion(sports, s -> s== persoChoisi.getSport());
		JComboBox<Age> ages = new JComboBox<>(Age.values());
		assignerQuestion(ages, a -> a== persoChoisi.getAge());
		JComboBox<Genre> genres = new JComboBox<>(Genre.values());
		assignerQuestion(genres, g -> g== persoChoisi.getGenre());
		JComboBox<CouleurCheveux> couleurs = new JComboBox<>(CouleurCheveux.values());
		assignerQuestion(couleurs, c -> c== persoChoisi.getCouleurCheveux());
		JComboBox<Pilosite> pilosites = new JComboBox<>(Pilosite.values());
		assignerQuestion(pilosites, p -> p== persoChoisi.getPilosite());
		JComboBox<Cheveux> cheveux = new JComboBox<>(Cheveux.values());
		assignerQuestion(cheveux, c -> c== persoChoisi.getCheveux());
		JComboBox<Personnage> labelPersos = new JComboBox<>(personnages);
//Fonction recherche nom 
		labelPersos.addActionListener(new ActionListener() {     
		//	@Override
			public void actionPerformed(ActionEvent e) {

				if(labelPersos.getSelectedItem()== persoChoisi)
				{   
					System.out.println("oui");
					choisissez.setVisible(false);
					reponseOui.setVisible(true);
					reponseNon.setVisible(false);
					frame.repaint();
					JOptionPane.showMessageDialog(null , "Félicitation vous avez trouvé le personnage !!");
					
				} 
				else {
					System.out.println("non");
					choisissez.setVisible(false);
					reponseNon.setVisible(true);
					reponseOui.setVisible(false);
					frame.repaint();
					JOptionPane.showMessageDialog(null , "Dommage, veuillez recommencer ");
				}


			} 
		});

		// changer l'icone de l'interface
		Image icone = Toolkit.getDefaultToolkit().getImage(Jeu.getImage("anneaux.png"));
		frame.setIconImage(icone);



		frame.add(question);
		frame.add(reponse);
		frame.add(validation);
		question.add(nationalites);
		question.add(sports);
		question.add(ages);
		question.add(genres);
		question.add(couleurs);
		question.add(pilosites);
		question.add(cheveux);
		validation.add(labelPersos);
		frame.pack();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.lightGray);
		frame.setVisible(true);
	}
}
