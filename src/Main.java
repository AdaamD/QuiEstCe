import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
import java.util.ArrayList; 
import java.util.Random;


public class Main 
{

    // Fonction choix d'un nb aléatoire
	public static  int Choixalea(){
		Random random = new Random();
		int nb_Alea = random.nextInt(18);
		return nb_Alea;
	}


	public static void main(String[] args) 
	{

        //création des perso

		Personnage  Djokovic_Novak  =  new  Personnage  (  "Novak Djokovic",Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.SERBE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ;
		Personnage  Hamilton_Lewis  =  new  Personnage  (  "Lewis Hamilton",Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.ANGLAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.LONG ,  Pilosite.BARBE  ) ;
		Personnage  Karabatic_Nikola  =  new  Personnage  (  "Nikola Karabatic",Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ;
		Personnage  Laffont_Perrine  =  new  Personnage  (  "Perrine Laffont ",Sport.INDIVIDUEL  ,  Age.MOINS_VINGT_CINQ ,  Nationalite.FRANCAISE ,  CouleurCheveux.CLAIR ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ;
		Personnage  Lebron_James  =  new  Personnage  (  "LeBron James",Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ;
		Personnage  Manaudou_Laure  =  new  Personnage  (  "Laure Manaudou",Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.FEMININ ,  Cheveux . LONG ,  Pilosite . IMBERBE ) ;
		Personnage  Manaudou_Florent  =  new  Personnage  (  "Laurent Manaudou",Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.IMBERBE  ) ;
		Personnage  Mbappe_Kylian  =  new  Personnage  (  "Kylian Mbappe",Sport.COLLECTIF  ,  Age.MOINS_VINGT_CINQ ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.IMBERBE  ) ;
		Personnage  Mcgregor_Conor  =  new  Personnage  (  "Conor Mcgregor",Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.IRLANDAISE ,  CouleurCheveux.CLAIR ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ;
		Personnage  Messi_Lionel  =  new  Personnage  (  "Lionel Messi",Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.ARGENTINE ,  CouleurCheveux.FONCE ,  Genre . MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ;
		Personnage  Morgan_Alex  =  new  Personnage  (  "Alex Morgan",Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ;
		Personnage  Raikkonen_Kimi  =  new  Personnage  (  "Kimi Raikkonen",Sport.INDIVIDUEL  ,  Age.PLUS_DE_QUARANTE ,  Nationalite.FINLANDAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.IMBERBE  ) ;
		Personnage  Renard_Wendie  =  new  Personnage  (  "Wendie Renard",Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ;
		Personnage  Williams_Serena  =  new  Personnage  (  "Serena Williams",Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ;
		Personnage  Yoka_Tony =  new  Personnage  (  "Tony Yoka",Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ;
		Personnage  Zidane_Zinedine  =  new  Personnage  (  "Zinedine Zidane",Sport.COLLECTIF  ,  Age.PLUS_DE_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.IMBERBE  ) ;


		ArrayList<Personnage> liste_perso = new ArrayList<Personnage> ();
		liste_perso.add(Zidane_Zinedine);
		liste_perso.add(Djokovic_Novak);
		liste_perso.add(Hamilton_Lewis);
		liste_perso.add(Karabatic_Nikola);      
		liste_perso.add(Laffont_Perrine);
		liste_perso.add(Lebron_James);      
		liste_perso.add(Manaudou_Laure);
		liste_perso.add(Manaudou_Florent);      
		liste_perso.add(Mbappe_Kylian);         
		liste_perso.add(Mcgregor_Conor);        
		liste_perso.add(Messi_Lionel);          
		liste_perso.add(Morgan_Alex);
		liste_perso.add(Raikkonen_Kimi);        
		liste_perso.add(Renard_Wendie);
		liste_perso.add(Williams_Serena);       
		liste_perso.add(Yoka_Tony);

//////////////////////////////////////////////////////////////////////////////////////////////

		JLabel label = new JLabel("BIENVENUE SUR QUI-EST-CE?", JLabel.CENTER);

// PREND UN PERSO AU HASARD
		int i= Choixalea();
		Personnage perso = liste_perso.get(i);
		

// Définition le nom de l'interface graphique 
		JFrame frame = new JFrame("Qui est ce ??");


		//Créer un panel 
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();

//Menu du haut 
            // Définir le menu principal					
		JMenuBar menu = new JMenuBar();						
		JMenu file = new JMenu("Fichier");					
		JMenu edit = new JMenu("Edition");					
		JMenu help = new JMenu("Aide");	

// Définir le sous-menu pour Fichier
		JMenuItem newf = new JMenuItem("Nouveau");
		JMenuItem open = new JMenuItem("Ouvrir");
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


//Creation des ICON de personnages 

		ImageIcon djokovic= new ImageIcon(new ImageIcon("img/djokovic.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
		ImageIcon hamilton= new ImageIcon(new ImageIcon("img/hamilton.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
		ImageIcon karabatic= new ImageIcon(new ImageIcon("img/karabatic.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
		ImageIcon laffont= new ImageIcon(new ImageIcon("img/laffont.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
		ImageIcon lebron= new ImageIcon(new ImageIcon("img/lebron.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
		ImageIcon lmanaudou= new ImageIcon(new ImageIcon("img/lmanaudou.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
		ImageIcon manaudou= new ImageIcon(new ImageIcon("img/manaudou.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
		ImageIcon mbappe= new ImageIcon(new ImageIcon("img/mbappe.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT)); 
		ImageIcon mcgregor= new ImageIcon(new ImageIcon("img/mcgregor.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));   
		ImageIcon messi= new ImageIcon(new ImageIcon("img/messi.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));      
		ImageIcon morgan= new ImageIcon(new ImageIcon("img/morgan.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));  
		ImageIcon raikonen= new ImageIcon(new ImageIcon("img/raikonen.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
		ImageIcon renard= new ImageIcon(new ImageIcon("img/renard.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
		ImageIcon williams= new ImageIcon(new ImageIcon("img/williams.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
		ImageIcon yoka= new ImageIcon(new ImageIcon("img/yoka.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
		ImageIcon zidane= new ImageIcon(new ImageIcon("img/zidane.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));

		ImageIcon croix= new ImageIcon(new ImageIcon("img/croix.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));


//Creation des BOUTONS de personnages  
		JButton djokovic1 = new JButton(djokovic);
		JButton hamilton1 = new JButton(hamilton);
		JButton karabatic1 = new JButton(karabatic);
		JButton laffont1 = new JButton(laffont);
		JButton lebron1 = new JButton(lebron);
		JButton lmanaudou1 = new JButton(lmanaudou);
		JButton manaudou1 = new JButton(manaudou);
		JButton mbappe1 = new JButton(mbappe);
		JButton mcgregor1 = new JButton(mcgregor);
		JButton messi1 = new JButton(messi);
		JButton morgan1 = new JButton(morgan);
		JButton raikonen1 = new JButton(raikonen);
		JButton renard1 = new JButton(renard);
		JButton williams1 = new JButton(williams);
		JButton yoka1 = new JButton(yoka);
		JButton zidane1 = new JButton(zidane);


djokovic1.setBounds(40,80,200,250);

// Ajout des boutons au frame
		panel1.add(djokovic1); 
		panel1.add(hamilton1);
		panel1.add(karabatic1);
		panel1.add(laffont1);
		panel2.add(lebron1); 
		panel2.add(lmanaudou1);
		panel2.add(manaudou1);
		panel2.add(mbappe1);
		panel3.add(mcgregor1);
		panel3.add(messi1);
		panel3.add(morgan1);
		panel3.add(raikonen1);
		panel4.add(renard1);
		panel4.add(williams1);
		panel4.add(yoka1);
		panel4.add(zidane1);


// Ajout des label & panel au frame
		frame.add(label);
		frame.setLayout(new GridLayout(9,1));
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);


 //Creation de liste des déroulantes 
		JPanel question = new JPanel();
		JPanel reponse =  new JPanel();
		JPanel validation = new JPanel();

	//Sport 		
		Sport[] sport= { Sport.INDIVIDUEL , Sport.COLLECTIF};
	//AGE	
		Age [] age= {Age.MOINS_VINGT_CINQ , Age.ENTRE_VINGT_CINQ_ET_QUARANTE , Age.PLUS_DE_QUARANTE};

	//Nationalite
		Nationalite[] nationalite = {Nationalite.ANGLAISE, Nationalite.ALLEMANDE, Nationalite.FINLANDAISE,
		Nationalite.USA, Nationalite.SERBE , Nationalite.ARGENTINE, Nationalite.IRLANDAISE,Nationalite.FRANCAISE };
		
	//GENRE
		Genre[] genre= {Genre.MASCULIN , Genre.FEMININ};
	//COULEUR CHEVEUX
		CouleurCheveux[]couleurcheveux= {CouleurCheveux.FONCE , CouleurCheveux.CLAIR};
	//PILOISTE 
		Pilosite[]pilosite={Pilosite.IMBERBE , Pilosite.BARBE};
	//CHEVEUX 
		Cheveux [] cheveux= {Cheveux.COURT, Cheveux.LONG , Cheveux.CHAUVE};
	//Nom 
		String[] nom= {"Novak Djokovic","Lewis Hamilton", "Nikola Karabatic", "Perrine Laffont",
		"LeBron James", "Laure Manaudou", "Laurent Manaudou", "Kylian Mbappe",
		"Conor Mcgregor","Lionel Messi","Alex Morgan","Kimi Raikkonen",
		"Wendie Renard", "Serena Williams","Tony Yoka", "Zinedine Zidane"};


		JComboBox ld1 = new JComboBox(nationalite);
		JComboBox ld2= new JComboBox(sport);
		JComboBox ld3 = new JComboBox(age);
		JComboBox ld4 = new JComboBox(genre);
		JComboBox ld5 = new JComboBox(couleurcheveux);
		JComboBox ld6 = new JComboBox(pilosite);
		JComboBox ld7 = new JComboBox(cheveux);
		JComboBox ld8 = new JComboBox(nom);






		JLabel label1 = new JLabel("Bien joué c'est correct ", JLabel.CENTER);
		JLabel label2 = new JLabel("Pas du tout, c'est faux retente !! ", JLabel.CENTER);
		JLabel label3 = new JLabel("Choisissez votre question ", JLabel.CENTER);

		reponse.add(label3);

//Modification perso en croix

		djokovic1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				djokovic1.setIcon(croix);				
			} 
		}); 
		hamilton1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				hamilton1.setIcon(croix);				
			} 
		});
		karabatic1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				karabatic1.setIcon(croix);				
			} 
		});
		laffont1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				laffont1.setIcon(croix);				
			} 
		});
		lebron1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				lebron1.setIcon(croix);				
			} 
		});
		lmanaudou1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				lmanaudou1.setIcon(croix);				
			} 
		});
		manaudou1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				manaudou1.setIcon(croix);				
			} 
		});
		mbappe1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				mbappe1.setIcon(croix);				
			} 
		});
		mcgregor1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				mcgregor1.setIcon(croix);				
			} 
		});
		messi1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				messi1.setIcon(croix);				
			} 
		});
		morgan1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				morgan1.setIcon(croix);				
			} 
		});
		raikonen1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				raikonen1.setIcon(croix);				
			} 
		});
		renard1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				renard1.setIcon(croix);				
			} 
		});
		williams1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				williams1.setIcon(croix);				
			} 
		});
		yoka1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				yoka1.setIcon(croix);				
			} 
		});
		zidane1.addActionListener(new ActionListener() {     

			public void actionPerformed(ActionEvent e) {
				zidane1.setIcon(croix);				
			} 
		});



//Fonction recherche nationalite
		ld1.addActionListener(new ActionListener() {     
		//	@Override
			public void actionPerformed(ActionEvent e) {
				
				if(ld1.getSelectedItem()== perso.getNationalite())
				{   
					System.out.println("ok");
					reponse.add(label1);
					label3.setVisible(false);
					label1.setVisible(true);
					label2.setVisible(false);
					frame.repaint();

					
				} 
				else {
					System.out.println("Nooon");
					reponse.add(label2);
					label3.setVisible(false);
					label2.setVisible(true);
					label1.setVisible(false);
					frame.repaint();
				}
			} 
		});

//fonction recherche Sport
		ld2.addActionListener(new ActionListener() {     
		//	@Override
			public void actionPerformed(ActionEvent e) {

				if(ld2.getSelectedItem()== perso.getSport())
				{   
					System.out.println("ok");
					reponse.add(label1);
					label3.setVisible(false);
					label1.setVisible(true);
					label2.setVisible(false);
					frame.repaint();
					
				} 
				else {
					System.out.println("Nooon");
					reponse.add(label2);
					label3.setVisible(false);
					label2.setVisible(true);
					label1.setVisible(false);
					frame.repaint();
				}
			} 
		});

//fonction recherche Age
		ld3.addActionListener(new ActionListener() {     
		//	@Override
			public void actionPerformed(ActionEvent e) {

				if(ld3.getSelectedItem()== perso.getAge())
				{   
					System.out.println("ok");
					reponse.add(label1);
					label3.setVisible(false);
					label1.setVisible(true);
					label2.setVisible(false);
					frame.repaint();
					
				} 
				else {
					System.out.println("Nooon");
					reponse.add(label2);
					label3.setVisible(false);					
					label2.setVisible(true);
					label1.setVisible(false);
					frame.repaint();
					;}
				} 
			});

//fonction recherche Genre
		ld4.addActionListener(new ActionListener() {     
		//	@Override
			public void actionPerformed(ActionEvent e) {
				if(ld4.getSelectedItem()== perso.getGenre())
				{   
					System.out.println("ok");
					reponse.add(label1);
					label3.setVisible(false);
					label1.setVisible(true);
					label2.setVisible(false);
					frame.repaint();
					
				} 
				else {
					System.out.println("Nooon");
					reponse.add(label2);
					label3.setVisible(false);
					label2.setVisible(true);
					label1.setVisible(false);
					frame.repaint();
				}
			} 
		});

//fonction recherche Couleur cheveux 
		ld5.addActionListener(new ActionListener() {     
		//	@Override
			public void actionPerformed(ActionEvent e) {

				if(ld5.getSelectedItem()== perso.getCouleurCheveux())
				{   
					System.out.println("ok");
					reponse.add(label1);
					label3.setVisible(false);
					label1.setVisible(true);
					label2.setVisible(false);
					frame.repaint();
					
				} 
				else {
					System.out.println("Nooon");
					reponse.add(label2);
					label3.setVisible(false);
					label2.setVisible(true);
					label1.setVisible(false);
					frame.repaint();
				}
			} 
		});

//fonction recherche Pilosite
		ld6.addActionListener(new ActionListener() {     
		//	@Override
			public void actionPerformed(ActionEvent e) {

				if(ld6.getSelectedItem()== perso.getPilosite())
				{   
					System.out.println("ok");
					reponse.add(label1);
					label3.setVisible(false);
					label1.setVisible(true);
					label2.setVisible(false);
					frame.repaint();
					
				} 
				else {
					System.out.println("Nooon");
					reponse.add(label2);
					label3.setVisible(false);
					label2.setVisible(true);
					label1.setVisible(false);
					frame.repaint();
				}
			} 
		});

//fonction recherche Cheveux
		ld7.addActionListener(new ActionListener() {     
		//	@Override
			public void actionPerformed(ActionEvent e) {

				if(ld7.getSelectedItem()== perso.getCheveux())
				{   
					System.out.println("ok");
					reponse.add(label1);
					label3.setVisible(false);
					label1.setVisible(true);
					label2.setVisible(false);
					frame.repaint();
					
				} 
				else {
					System.out.println("Nooon");
					reponse.add(label2);
					label3.setVisible(false);
					label2.setVisible(true);
					label1.setVisible(false);
					frame.repaint();
				}


			} 
		});
//Fonction recherche nom 
		ld8.addActionListener(new ActionListener() {     
		//	@Override
			public void actionPerformed(ActionEvent e) {

				if(ld8.getSelectedItem()== perso.getNom())
				{   
					System.out.println("ok");
					label3.setVisible(false);
					label1.setVisible(true);
					label2.setVisible(false);
					frame.repaint();
					JOptionPane.showMessageDialog(null , "Félicitation vous avez trouvé le personnage !!");
					
				} 
				else {
					System.out.println("Nooon");
					label3.setVisible(false);
					label2.setVisible(true);
					label1.setVisible(false);
					frame.repaint();
					JOptionPane.showMessageDialog(null , "Dommage, veuillez recommencer ");
				}


			} 
		});


		
		frame.add(question);
		frame.add(reponse);
		frame.add(validation);

		question.add(ld1);
		question.add(ld2);
		question.add(ld3);
		question.add(ld4);
		question.add(ld5);
		question.add(ld6);
		question.add(ld7);
		validation.add(ld8);




		frame.pack();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.lightGray);
		frame.setVisible(true);
	}
}
