import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
public class Cadres {
    private static Image icone = Toolkit.getDefaultToolkit().getImage(OuvrirFichier.getImage("anneaux.png"));
    public static JFrame cadre (JPanel[] panels){
        JFrame cadre = new JFrame ("Qui Est-ce ?");
		cadre.setIconImage(icone);
        cadre.setLayout(new GridLayout(8,1));
        return cadre; 

    }
    public static JFrame accueil (){
        JFrame accueil = new JFrame ("accueil");
        JLabel label = new JLabel("BIENVENUE SUR QUI-EST-CE?", JLabel.CENTER);
		accueil.add(label);
        accueil.setIconImage(icone);
        return accueil;}
    
}
