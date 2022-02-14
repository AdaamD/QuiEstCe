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
		//CREATION DES PERSO 
		
		Personnage  Zidane_Zinedine  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.PLUS_DE_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.IMBERBE  ) ; 
		Personnage  Biles_Simone  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.MOINS_VINGT_CINQ ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ; 
		Personnage  Djokovic_Novak  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.SERBE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ; 
		Personnage  Florsch_Sofia  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.MOINS_VINGT_CINQ ,  Nationalite.ALLEMANDE ,  CouleurCheveux.CLAIR ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ; 
		Personnage  Hamilton_Lewis  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.ANGLAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.LONG ,  Pilosite.BARBE  ) ; 
		Personnage  Karabatic_Nikola  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ; 
		Personnage  Laffont_Perrine  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.MOINS_VINGT_CINQ ,  Nationalite.FRANCAISE ,  CouleurCheveux.CLAIR ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ; 
		Personnage  Lebron_James  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ; 
		Personnage  Manaudou_Laure  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.FEMININ ,  Cheveux . LONG ,  Pilosite . IMBERBE ) ; 
		Personnage  Manaudou_Florent  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.IMBERBE  ) ; 
		Personnage  Mbappe_Kylian  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.MOINS_VINGT_CINQ ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.IMBERBE  ) ; 
		Personnage  Mcgregor_Conor  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.IRLANDAISE ,  CouleurCheveux.CLAIR ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ; 
		Personnage  Messi_Lionel  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.ARGENTINE ,  CouleurCheveux.FONCE ,  Genre . MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ; 
		Personnage  Morgan_Alex  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ; 
		Personnage  Raikkonen_Kimi  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.PLUS_DE_QUARANTE ,  Nationalite.FINLANDAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.IMBERBE  ) ; 
		Personnage  Renard_Wendie  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ; 
		Personnage  Williams_Serena  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ; 
		Personnage  Yoka_Tony =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ; 

		ArrayList<Personnage> liste_perso = new ArrayList<Personnage> ();
		liste_perso.add(Zidane_Zinedine);
		liste_perso.add(Biles_Simone);
		liste_perso.add(Djokovic_Novak);
		liste_perso.add(Florsch_Sofia);
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


		// PREND UN PERSO AU HASARD
		int i= Choixalea();
		Personnage perso = liste_perso.get(i);
		System.out.println(liste_perso.get(i));





        // Définissez le nom de l'interface graphique 
		JFrame frame = new JFrame("Qui est ce ??");



        // Créer listes déroulantes
		String[] liste_deroul1 = {"genre", "Femme", "Chauve", "oui", ""};
		String[] liste_deroul2 = {"Homme", "2", "3", "4"};


		//Creéer un panel 
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		

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



        // Affiche une liste déroulante
		JComboBox cb1 = new JComboBox(liste_deroul1 );
		JComboBox cb2 = new JComboBox(liste_deroul2 );






         // Définir les boutons
		ImageIcon icon= new ImageIcon(new ImageIcon("img/draw.png").getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
		ImageIcon raikonen= new ImageIcon(new ImageIcon("img/raikonen.jpg").getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
		ImageIcon lebron= new ImageIcon(new ImageIcon("img/lebron.jpg").getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));		ImageIcon zidane= new ImageIcon("zidane.jpg");
		ImageIcon messi= new ImageIcon(new ImageIcon("img/messi.jpg").getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
		
		//Creation des boutons

		JButton raikonen1 = new JButton(raikonen);
		JButton raikonen2 = new JButton(raikonen);
		JButton raikonen3 = new JButton(raikonen);
		JButton raikonen4 = new JButton(raikonen);
		JButton messi1 = new JButton(messi);
		JButton messi2 = new JButton(messi);
		JButton messi3 = new JButton(messi);
		JButton messi4 = new JButton(messi);
		JButton lebron1 = new JButton(lebron);
		JButton lebron2 = new JButton(lebron);
		JButton lebron3 = new JButton(lebron);
		JButton lebron4 = new JButton(lebron);





         // Ajouter les boutons au frame
		panel.add(raikonen1); 
		panel.add(raikonen2);
		panel.add(raikonen3);
		panel.add(raikonen4);
		panel2.add(messi1); 
		panel2.add(messi2);
		panel2.add(messi3);
		panel2.add(messi4);
		panel3.add(lebron1);
		panel3.add(lebron4);
		panel3.add(lebron2);
		panel3.add(lebron3);
		

		JLabel label = new JLabel("BIENVENUE SUR QUI-EST-CE?", JLabel.CENTER);





        // Ajouter label et panel au frame
		//nom_Interface.setLayout(new GridLayout(10, 1));
		frame.add(label);


		frame.setLayout(new GridLayout(5,1));
		


		frame.add(panel);
		frame.add(panel2);
		frame.add(panel3);
		
		frame.pack();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);




		JPanel question = new JPanel();


		Nationalite[] items = {Nationalite.ANGLAISE, Nationalite.ALLEMANDE, Nationalite.FINLANDAISE,
		Nationalite.USA, Nationalite.SERBE , Nationalite.ARGENTINE, Nationalite.IRLANDAISE,Nationalite.FRANCAISE };

		JComboBox cb = new JComboBox(items);

		//fonction renvoie boolean vrai
		//si la valeur selectionné est egale
		// a la valeur du perso 
		JLabel label1 = new JLabel("ooooook c'est bon c'est ca ", JLabel.RIGHT);
		JLabel label2 = new JLabel("PAS DU TOUT C'EST FAUX !! ", JLabel.RIGHT);



		cb.addActionListener(new ActionListener() {     
			@Override
			public void actionPerformed(ActionEvent e) {

				if(cb.getSelectedItem()== perso.getNationalite())
				{	
					System.out.println("ok");
					frame.add(label1);
					label1.setVisible(true);
					label2.setVisible(false);
} 
					else {
						System.out.println("Nooon");
						frame.add(label2);
						label2.setVisible(true);
						label1.setVisible(false);}
					} 
				});

		question.add(cb);
		frame.add(question);

		frame.setLayout(new GridLayout (6,1));


	}
}

