import javax.swing.*;
import java.awt.*;

public class Main 
{
    public static void main(String[] args) 
    {
        // Définissez le nom de l'interface graphique 
        JFrame nom_Interface = new JFrame("Qui est ce ??");



        // Créer listes déroulantes
            String[] liste_deroul1 = {"Sexe", "Femme", "Chauve", "oui", ""};
            String[] liste_deroul2 = {"Homme", "2", "3", "4"};


        // Affiche une liste déroulante
            JComboBox cb1 = new JComboBox(liste_deroul1 );
            JComboBox cb2 = new JComboBox(liste_deroul2 );


        // Definis colonne(attributs) de la table 
            String[] column = {"ID", "Nom", "Age", "Adresse"};
    
        //Définis les lignes du JTable
            String[][] data = {
                {"01", "Thomas", "55", "Paris"}, 
                {"02", " ", "45", "Marseille"}, 
                  };

         // Définir les boutons
            JButton btn1 = new JButton("Bouton 1");
            JButton btn2 = new JButton("Bouton 2");      
        
        // Créer la JTable
            JTable table = new JTable(data, column);
            JScrollPane scroll = new JScrollPane(table); 
            nom_Interface.add(scroll);


        //Creéer un panel 
            JPanel panel = new JPanel();

        // Définir le menu principal
            JMenuBar menu = new JMenuBar();
            JMenu file = new JMenu("Fichier");
            JMenu edit = new JMenu("Edition");
            JMenu help = new JMenu("Aide");
         
        // Définir le sous-menu pour Fichier
            JMenuItem newf = new JMenuItem("Nouveau");
            JMenuItem quit = new JMenuItem("Ouvrir");
            JMenuItem save = new JMenuItem("Enregistrer");

         // Ajouter les boutons au frame
            panel.add(btn1); 
            panel.add(btn2);

        JLabel label = new JLabel("Je suis un JLabel", JLabel.CENTER);
         
        // Ajouter label et panel au frame
            nom_Interface.setLayout(new GridLayout(2, 1));
            nom_Interface.add(label);
            nom_Interface.add(panel);
 
        file.add(newf);
        file.add(save);
        file.add(quit);
         
        menu.add(file);
        menu.add(edit);
        menu.add(help);



    
        nom_Interface.setLayout(new GridLayout(6, 1));
        nom_Interface.add(cb1);
        nom_Interface.add(cb2);

        nom_Interface.add(menu);
        nom_Interface.add(panel);


        nom_Interface.pack();
        nom_Interface.setSize(500, 500);
        nom_Interface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nom_Interface.setVisible(true);
    }
}