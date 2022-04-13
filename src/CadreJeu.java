public class CadreJeu {

public CadreJeu ( JButton BoutonPerssonage , JComboBox ListePersonnages , JComboBox ListeValeurs ) {}

public void  repondreOui() {
            System.out.println("oui");
			reponseOui.setVisible(true);
			reponseNon.setVisible(false);
			choisissez.setVisible(false);
			frame.repaint();}


public void repondreNon() {
            System.out.println("non");
			reponseNon.setVisible(true);
			reponseOui.setVisible(false);
			choisissez.setVisible(false);
			frame.repaint();}

public void repondreGagne(){
    
    if(labelPersos.getSelectedItem()== persoChoisi1 )
 { 
        System.out.println("Vous avez trouvez le personnages ");
        choisissez.setVisible(false);
        reponseOui.setVisible(true);
        reponseNon.setVisible(false);
        frame.repaint();
        JOptionPane.showMessageDialog(null , "Félicitation vous avez trouvé le personnage !!");}

public void repondrePerdu(){
    if(labelPersos.getSelectedItem() != persoChoisi1 )
    System.out.println("Vous n'avez pas trouvé le personnages ");
    choisissez.setVisible(false);
    reponseNon.setVisible(true);
    reponseOui.setVisible(false);
    frame.repaint();
    JOptionPane.showMessageDialog(null , "Dommage, veuillez recommencer ");
 }



}