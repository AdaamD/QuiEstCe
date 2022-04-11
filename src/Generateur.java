
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.Random;
import java.util.function.Function;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Generateur
{

	private static <E> void assignerQuestion(JComboBox<E> box){
		box.addActionListener(new ActionListener() { 
 // @Override
			public void actionPerformed(ActionEvent e) {

				System.out.println(box.getSelectedItem()) ;


			}
		});
	}



	int li=0;
	public void remplir(String [][] tab,String j,String k,String l,String m,String n,String o,String p,String q,String r,String s){
		tab[li][0]=j;
		tab[li][1]=k;
		tab[li][2]=l;
		tab[li][3]=m;
		tab[li][4]=n;
		tab[li][5]=o;
		tab[li][6]=p;
		tab[li][7]=q;
		tab[li][8]=r;
		tab[li][9]=s;
		li++;

	}

	public void boutonOption ( String attribut , String [] valeurs ){ 


	} 

	public static void main(String args[])
	{

		JFrame frame = new JFrame("Generateur");
		JFrame accueil = new JFrame("Generateur");
		JFrame creation= new JFrame("Generateur");
		JPanel panel = new JPanel();
		JPanel panelattr = new JPanel();
		JPanel panelcre1= new JPanel();
		JPanel panelcre2=new JPanel();


//nb d'attributs
		JButton attr= new JButton ("valider");
		JLabel labatt = new JLabel("choisir le nombre d'attributs");
		SpinnerModel model = new SpinnerNumberModel(5,0,10,1);
		JSpinner nbAtt=new JSpinner(model);             
		nbAtt.setBounds(500,30,50,30);

		System.out.println("nb attribut: " + ((int)nbAtt.getValue()+1-1));



		//sélectionner les attributs des persos
		JTextField nomPerso= new JTextField("saisir le nom ici");nomPerso.setBounds(10,30,150,30);

		JButton create= new JButton("créer");



		JTextField attribut = new JTextField("entrez l'attribut ");
		attribut.setBounds(10,30,150,30);
		JTextField valeurs1 = new JTextField("entrez les valeurs");
		valeurs1.setBounds(200,60,150,30);
		JTextField valeurs2 = new JTextField("");
		valeurs2.setBounds(200,90,150,30);
		JTextField valeurs3 = new JTextField("");
		valeurs3.setBounds(200,120,150,30);
		JTextField valeurs4 = new JTextField("");
		valeurs4.setBounds(200,150,150,30);
		JTextField valeurs5 = new JTextField("");
		valeurs5.setBounds(200,180,150,30);
		JTextField valeurs6 = new JTextField("");
		valeurs6.setBounds(200,210,150,30);
		JTextField valeurs7 = new JTextField("");
		valeurs7.setBounds(200,240,150,30);
		JTextField valeurs8 = new JTextField("");
		valeurs8.setBounds(200,270,150,30);
		JTextField valeurs9 = new JTextField("");
		valeurs9.setBounds(200,300,150,30);
		JTextField valeurs10 = new JTextField("");
		valeurs10.setBounds(200,330,150,30); 




		String val[] =new String [10]; 


		JButton creer = new JButton("creer");
		int compteur=0;
		int[] cpt={compteur};
		int taille=(int) nbAtt.getValue();







//bouton créer

		String z[][]= new String[taille][10];
		String personnage[][]= new String[16][taille];



		attr.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				accueil.setVisible(false);
				frame.setVisible(true);
			}
		});


		ArrayList<String> listAtt= new ArrayList<String>();
		ArrayList <JComboBox> joke= new ArrayList<JComboBox>();

		creer.addActionListener(new ActionListener() { 
 // @Override
			public void actionPerformed(ActionEvent e) {


 //System.out.println(jet);
				String x=attribut.getText(); 
				listAtt.add(x);




				String j=valeurs1.getText();
				String k =valeurs2.getText(); 
				String l= valeurs3.getText() ;
				String m = valeurs4.getText() ; 
				String n= valeurs5.getText() ;
				String o  =valeurs6.getText() ; 
				String p = valeurs7.getText(); 
				String q= valeurs8.getText() ;
				String r =valeurs9.getText() ;
				String s= valeurs10.getText() ; 

				Jeu.remplir(z,j,k,l,m,n,o,p,q,r,s);

				for (int att=0; att<z.length;att++){
					for (int par=0;par<10;par++){
						//System.out.println(z.length);
						System.out.println(z[att][par]);
					}
					
				}
				String s1[]={j,k,l,m,n,o,p,q,r,s};
				JComboBox<String> bobox= new JComboBox<String> (s1);
				panelcre1.add(bobox);
				joke.add(bobox);


				if (z[4][0]!=null){creation.setVisible(true);frame.setVisible(false);}


			}
		});


		

		create.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				personnage[0][0]=nomPerso.getText();
				System.out.println(personnage[0][0]);
				for (int aa=0;aa<=joke.size();aa++){					
					System.out.println(joke.get(aa).getSelectedItem());
					personnage[0][aa]=(String)joke.get(aa).getSelectedItem();
					System.out.println(personnage[0][aa]);
				}
				

			System.out.println(" nom: "+personnage[0][0]+"\n"+listAtt.get(0)+" : "+personnage[0][1]+listAtt.get(1)+" : "+personnage[0][2]
			+listAtt.get(2)+" : "+personnage[0][3]
			+listAtt.get(3)+" : "+personnage[0][4]);

			}
		});

		



		frame.add(attribut) ; 
		frame.add(valeurs1) ; 
		frame.add(valeurs2) ;
		frame.add(valeurs3) ;
		frame.add(valeurs4) ;
		frame.add(valeurs5) ;
		frame.add(valeurs6) ;
		frame.add(valeurs7) ;
		frame.add(valeurs8) ;
		frame.add(valeurs9) ;
		frame.add(valeurs10) ; 
		panel.add(creer) ;
		frame.add(panel) ;

		accueil.add(panelattr);
		panelattr.add(labatt);
		panelattr.add(nbAtt);
		panelattr.add(attr);

		creation.add(panelcre1);
		creation.add(panelcre2);
		panelcre1.add(nomPerso);
		panelcre2.add(create);



		accueil.pack();
		accueil.setSize(500, 200);
		accueil.setLocationRelativeTo(null);
		accueil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		accueil.getContentPane().setBackground(Color.lightGray);
		accueil.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.WHITE));
		accueil.setVisible(true);

		frame.pack();
		frame.setSize(1000, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.lightGray);
		frame.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.WHITE));
		frame.setVisible(false);

		creation.pack();
		creation.setSize(1000, 500);
		creation.setLocationRelativeTo(null);
		creation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		creation.getContentPane().setBackground(Color.lightGray);
		creation.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.WHITE));
		creation.setVisible(false);
		creation.setLayout(new GridLayout(2,1)) ;


	}
}
