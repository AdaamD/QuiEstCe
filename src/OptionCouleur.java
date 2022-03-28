import javax.swing.JMenuItem;

import java.awt.Color; 
public class OptionCouleur extends JMenuItem {
    public OptionCouleur(String nom, Color couleur){
        super(nom);
        addActionListener(e ->{
			for (int i=0;i<4;i++) panelsPersos[i].setBackground(couleur);
			menu.setBackground(couleur);
			question.setBackground(couleur);reponse.setBackground(couleur);validation.setBackground(Color.YELLOW);
			frame.setBackground(couleur);
			frame.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, couleur));
			accueil.getContentPane().setBackground(couleur);
			accueil.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.YELLOW));
		});
    }
    
}
