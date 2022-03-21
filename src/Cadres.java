import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.*;
public class Cadres {
    private static Image icone = Toolkit.getDefaultToolkit().getImage(Jeu.getImage("anneaux.png"));
    private static JFrame cadre = new JFrame ("Qui Est-ce ?");
    public static JFrame cadre (){
		cadre.setIconImage(icone);
        cadre.setLayout(new GridLayout(8,1));
        cadre.setVisible(false);
        return cadre; 

    }
    public static JFrame accueil (){
       JFrame accueil = new JFrame("Accueil");
		accueil.setIconImage(icone);
        accueil.pack();
		accueil.setSize(1200, 1200);
		accueil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		accueil.setContentPane(new JLabel(new ImageIcon (Jeu.getImage("qui.jpg"))));
		accueil.getContentPane().setBackground(Color.lightGray);
		accueil.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.WHITE));
        //écran d'accueil
		JButton jouer= new JButton("");
		
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
				cadre.setVisible(true);	
                System.out.println("jeu cliqué");			
			}});

		accueil.add(jouer);	
        jouer.setVisible(true);
		accueil.setVisible(true);
		



        
        return accueil;}
    
}
