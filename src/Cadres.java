import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
public class Cadres {
    private static Image icone = Toolkit.getDefaultToolkit().getImage(Jeu.getImage("anneaux.png"));
    public static JFrame cadre (JPanel[] panels){
        JFrame cadre = new JFrame ("Qui Est-ce ?");
		cadre.setIconImage(icone);
        cadre.setLayout(new GridLayout(8,1));
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
		accueil.setVisible(true);
		



        
        return accueil;}
    
}
