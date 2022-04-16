import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main 

{
		
		private static final JFrame accueil = Cadres.accueil();
		private static final JLabel reponseOui = new JLabel("Oui ", JLabel.CENTER);
		private static final JLabel reponseNon = new JLabel("Non ", JLabel.CENTER);
		private static final JLabel choisissez = new JLabel("Choisissez votre question ", JLabel.CENTER);
		private static  JPanel[] panelsPersos; 
		private static final JFrame frame = Cadres.cadre(panelsPersos); 
		public static void repondreOui(){
			System.out.println("oui");
			reponseOui.setVisible(true);
			reponseNon.setVisible(false);
			choisissez.setVisible(false);
			frame.repaint();
		}
		public static void repondreNon(){
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

	public static void main(String[] args) 
	{ 	
	// menus 
		JMenuBar menu = new JMenuBar();						
		JMenu file = new JMenu("Fichier");					
		JMenu theme = new JMenu("Theme");					
		JMenu help = new JMenu("Aide");	
		JMenuItem newf = new JMenuItem("Redemarrer");
		JMenuItem load = new JMenuItem("Option Inutile");
		JMenuItem quit = new JMenuItem("Sauvegarder");
		JMenuItem aide = new JMenuItem("Aide");
		JMenuItem credit = new JMenuItem("Credits");
		JMenuItem coldefaut= new JMenuItem("Par defaut");
		JMenuItem jaune= new JMenuItem("Jaune");
		JMenuItem rose= new JMenuItem("Rose");
		JMenuItem orange= new JMenuItem("Orange");
		JMenuItem vert= new JMenuItem("Vert");
		JMenuItem bleu= new JMenuItem("Bleu");

		help.add(aide);
		help.add(credit);
		frame.add(menu);
		file.add(newf);
		file.add(load);
		file.add(quit);
		theme.add(coldefaut);
		theme.add(jaune);
		theme.add(orange);
		theme.add(rose);
		theme.add(vert);
		theme.add(bleu);
		quit.addActionListener(e -> { 
			try{
				Jeu.sauvegarder();
			}
			catch (IOException ex){
				System.err.println("echec de sauvegarde");
			}
			finally {
				frame.setVisible(false); 
				accueil.setVisible(true);
			}
			});
		aide.addActionListener(e -> {JOptionPane.showMessageDialog(null , "BIENVENUE sur 'QUI-EST-CE'.\n Afin de deviner le sportif aléatoirement sélectionné, vous pouvez serez aidé de:\n-sa nationalité\n -son type de sport(individuel ou collectif) \n -sa catégorie d'âge \n -son genre(masculin ou féminin)\n -et sa pilosité.","menu d'aide",JOptionPane.INFORMATION_MESSAGE);});
		credit.addActionListener(e-> {JOptionPane.showMessageDialog(null," This game has been developped by: \n -Paul FONTAINE \n -Adam DAIA \n -Matthias BLANC \n -Michel BE  ","Credit",JOptionPane.INFORMATION_MESSAGE);});

		menu.add(file);
		menu.add(theme);
		menu.add(help);

		JPanel question = new JPanel();
		JPanel reponse =  new JPanel();
		reponse.add(reponseOui);
		reponseOui.setVisible(false);
		reponse.add(reponseNon);
		reponseNon.setVisible(false); 
		reponse.add(choisissez);
		JPanel validation = new JPanel();
		Personnage[] personnages = Jeu.getPersonnages(
			(Arrays.asList(args).contains("c")),(Arrays.asList(args).contains("n"))
		);
		panelsPersos = BoutonPersonnage.panels(personnages);
		JLabel label = new JLabel("BIENVENUE SUR QUI-EST-CE?", JLabel.CENTER);
		//frame.add(label);
		Personnage persoChoisi = Jeu.personnageChoisi();
		System.out.println("le personnage choisi est: " + persoChoisi.getNom());
		frame.setLayout(new GridLayout(8,1));
		for (int i = 0; i < panelsPersos.length; i++){
			frame.add(panelsPersos[i]); 
		}

		
		Arrays.stream(ListeValeurs.listes()).forEach(liste -> question.add(liste));
		JComboBox<Personnage> labelPersos = new JComboBox<>(personnages);
//Fonction recherche nom 
		labelPersos.addActionListener(new ActionListener() {     
		//	@Override
			public void actionPerformed(ActionEvent e) {

				if(labelPersos.getSelectedItem()==persoChoisi)
				{   
					System.out.println("oui");
					choisissez.setVisible(false);
					reponseOui.setVisible(true);
					reponseNon.setVisible(false);
					frame.repaint();
					JOptionPane.showMessageDialog(null , "Felicitation vous avez trouve le personnage !!");
					
				} 
				else {
					System.out.println("non");
					choisissez.setVisible(false);
					reponseNon.setVisible(true);
					reponseOui.setVisible(false);
					frame.repaint();
					JOptionPane.showMessageDialog(null , "Dommage, vous pouvez reesayer ");
				}


			} 
		});
		question.add(labelPersos);

		// changer l'icone de l'interface
		
		

		//définition des différents thèmes
		coldefaut.addActionListener(e ->{
			for (int i=0;i<4;i++) panelsPersos[i].setBackground(Color.WHITE);
			menu.setBackground(Color.WHITE);
			question.setBackground(Color.WHITE);reponse.setBackground(Color.WHITE);validation.setBackground(Color.WHITE);
			frame.getContentPane().setBackground(Color.lightGray);
			frame.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.WHITE));
			accueil.getContentPane().setBackground(Color.lightGray);
			accueil.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.WHITE));
		});
		jaune.addActionListener(e ->{
			for (int i=0;i<4;i++) panelsPersos[i].setBackground(Color.YELLOW);
			menu.setBackground(Color.YELLOW);
			question.setBackground(Color.YELLOW);reponse.setBackground(Color.YELLOW);validation.setBackground(Color.YELLOW);
			frame.setBackground(Color.YELLOW);
			frame.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.YELLOW));
			accueil.getContentPane().setBackground(Color.YELLOW);
			accueil.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.YELLOW));
		});
		rose.addActionListener(e ->{
			for (int i=0;i<4;i++) panelsPersos[i].setBackground(Color.PINK);
			menu.setBackground(Color.PINK);
			question.setBackground(Color.PINK);reponse.setBackground(Color.PINK);validation.setBackground(Color.PINK);
			frame.setBackground(Color.PINK);
			frame.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.PINK));
			accueil.getContentPane().setBackground(Color.PINK);
			accueil.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.PINK));
		});
		orange.addActionListener(e ->{
			for (int i=0;i<4;i++) panelsPersos[i].setBackground(Color.ORANGE);
			menu.setBackground(Color.ORANGE);
			question.setBackground(Color.ORANGE);reponse.setBackground(Color.ORANGE);validation.setBackground(Color.ORANGE);
			frame.setBackground(Color.ORANGE);
			frame.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.ORANGE));
			accueil.getContentPane().setBackground(Color.ORANGE);
			accueil.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.ORANGE));
		});
		vert.addActionListener(e ->{
			for (int i=0;i<4;i++) panelsPersos[i].setBackground(Color.GREEN);
			menu.setBackground(Color.GREEN);
			question.setBackground(Color.GREEN);reponse.setBackground(Color.GREEN);validation.setBackground(Color.GREEN);
			frame.setBackground(Color.GREEN);
			frame.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GREEN));
			accueil.getContentPane().setBackground(Color.GREEN);
			accueil.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GREEN));
		});
		bleu.addActionListener(e ->{
			for (int i=0;i<4;i++) panelsPersos[i].setBackground(Color.CYAN);
			menu.setBackground(Color.CYAN);
			question.setBackground(Color.CYAN);reponse.setBackground(Color.CYAN);validation.setBackground(Color.CYAN);
			frame.setBackground(Color.CYAN);
			frame.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.CYAN));
			accueil.getContentPane().setBackground(Color.CYAN);
			accueil.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.CYAN));
		});


		
		
		
		//pour charger une partie ou lancer une nouvelle(pas encore fonctionnel)
		//new game
		newf.addActionListener(e ->{
			frame.dispose();
			accueil.dispose();
			Redemarrer.nouvellePartiePersosBase();
			

			;});

		//charger une partie
		load.addActionListener(e->{

			;});




			
		frame.add(question);
		frame.add(reponse);
		frame.add(validation);
		frame.pack();
		frame.setSize(1500, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.lightGray);
		frame.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.WHITE));
		frame.setVisible(false);



		//écran d'accueil
		JButton jouer= new JButton("");
		accueil.add(jouer);
		
	//rendre le bouton transparent
    	jouer.setOpaque(false);
    //enlever la zone de contenu
    	jouer.setContentAreaFilled(false);
    //enlever la bordure
   	 	jouer.setBorderPainted(false);
   	//pour lancer le jeu
		jouer.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				accueil.setVisible(false);
				frame.setVisible(true);				
			}});

		accueil.pack();
		accueil.setSize(1200, 1200);
		accueil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		accueil.setContentPane(new JLabel(new ImageIcon (OuvrirFichier.getImage("qui.jpg"))));
		accueil.getContentPane().setBackground(Color.lightGray);
		accueil.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.WHITE));
		accueil.setVisible(true);
		accueil.add(jouer);

		

	}
}
