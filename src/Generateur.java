
import javax.swing.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.*;
import java.awt.event.*;  
import java.util.Random;
import java.util.function.Function;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

class Generateur
{
    private static ArrayList<Personnage> persosCrees; 
    private static final Gson gson = new GsonBuilder().create();
    private static <E> void assignerQuestion(JComboBox<E> box){
        box.addActionListener(new ActionListener() {    
                //    @Override
            public void actionPerformed(ActionEvent e) {
               
                System.out.println(box.getSelectedItem()) ;
               
               
            }
        });
    }

    

    public static void main(String args[])
    {


        JFrame frame = new JFrame("Generateur");
        JFrame photos = new JFrame("Personnages générés");
        JPanel panel = new JPanel();
        
        
       

        JButton valider = new JButton("Valider");
        JButton cliquer = new JButton("creer");
        JButton exporter = new JButton("Exporter grille de personnages") ; 
        JTextField nom = new JTextField("entrez le nom "); nom.setBounds(20,40,200,28);
        JTextField img = new JTextField("entrez le lien de l'image "); img.setBounds(20,40,200,28); img.setVisible(false);
       
        valider.setBounds(100,100,100,40);
        cliquer.setBounds(100,100,100,40);    
        exporter.setBounds(100,200,500,40);


         frame.add(nom);
        frame.add(img);
        frame.add(cliquer);
        frame.add(exporter); 
      exporter.addActionListener(new ActionListener() {    

                    public void actionPerformed(ActionEvent e) {
                        
                        if (persosCrees.size() == 16) {
                            Personnage[] ps = (Personnage[]) persosCrees.toArray(); 
                            String s = gson.toJson(ps);
                            try {
                            Files.deleteIfExists(Paths.get("../persosCustom.json"));
                            Files.write(Paths.get("../persosCustom.json"),s.getBytes()); }
                            catch (IOException ioe){
                                System.err.println("erreur dans export de la grille");
                                ioe.printStackTrace();
                            }

                        }

                        
                       
                    }
                });


               

            


        cliquer.addActionListener(new ActionListener() {    
                //    @Override
            public void actionPerformed(ActionEvent e) {
               
                panel.setVisible(true);
                nom.setVisible(false);
                img.setVisible(true);
                cliquer.setVisible(false);
                exporter.setVisible(false);
                panel.add(valider);                  
            }
        });



       

       

        JComboBox<Nationalite> nationalites = new JComboBox<> (Nationalite.values());
    //assignerQuestion(nationalites);
        JComboBox<Sport> sports= new JComboBox<>(Sport.values());
        //assignerQuestion(sports);
        JComboBox<Age> ages = new JComboBox<>(Age.values());
        //assignerQuestion(ages);
        JComboBox<Genre> genres = new JComboBox<>(Genre.values());
        //assignerQuestion(genres);
        JComboBox<CouleurCheveux> couleurs = new JComboBox<>(CouleurCheveux.values());
        //assignerQuestion(couleurs);
        JComboBox<Pilosite> pilosites = new JComboBox<>(Pilosite.values());
        //assignerQuestion(pilosites);
        JComboBox<Cheveux> cheveux = new JComboBox<>(Cheveux.values());
        //assignerQuestion(cheveux);

        JPanel[] panelsPersos = {new JPanel()};
       
       
        valider.addActionListener(new ActionListener() {    
                //    @Override
            public void actionPerformed(ActionEvent e) {
               
                Sport    var1 =(Sport) sports.getSelectedItem();
                Age var2 =(Age) ages.getSelectedItem();
                Nationalite var3= (Nationalite ) nationalites.getSelectedItem();
                CouleurCheveux var4=    (CouleurCheveux) couleurs.getSelectedItem();
                Genre var5=(Genre) genres.getSelectedItem();
                Cheveux var6=(Cheveux) cheveux.getSelectedItem();
                Pilosite var7=(Pilosite) pilosites.getSelectedItem();
                String nomecrit = nom.getText();
                String image = img.getText();
                Personnage TEST  = new Personnage (var1, var2, var3 , var4,var5 , var6, var7 , nomecrit , image);
               
                System.out.println (TEST.toStringGen());
                int i=0;
               
                photos.setVisible(true);
                photos.setVisible(false); photos.setVisible(true);
                frame.setVisible(true);
                panel.setVisible(false);
                nom.setVisible(true);
                img.setVisible(false);
                cliquer.setVisible(true);
                panel.remove(valider);
                photos.setExtendedState(JFrame.MAXIMIZED_BOTH);

               
               

               

               
               
                JButton bouton = new JButton(new ImageIcon(new ImageIcon(Jeu.getImage(TEST.getPhoto())).getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT)));
               
               
                panelsPersos[i].add(bouton);
                photos.add(panelsPersos[i]);
               
                i=i+1;

                bouton.addActionListener(new ActionListener() {    

                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null,"Nom:"+nomecrit+"\nSport: "+var1+"\nAge: "+var2+"\nNationalité: "+var3+"\nCouleur de cheveux: "+var4+"\nGenre: "+var5+"\nCheveux: "+var6+"\nPilosité: "+var7);
                       
                    }
                });


               

            }}); 

       


        
       
        exporter.setVisible(true);
        panel.add(nationalites);
        panel.add(sports);
        panel.add(ages);
        panel.add(genres);
        panel.add(couleurs);
        panel.add(pilosites);
        panel.add(cheveux);
        panel.setVisible(false);


        frame.add(panel);



        frame.pack();
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.WHITE));
        frame.setVisible(true);
        photos.pack();


        photos.setSize(1200,1200);
        photos.setExtendedState(JFrame.MAXIMIZED_BOTH);

        photos.setUndecorated(true);
        photos.setVisible(false);
       
        photos.getContentPane().setBackground(Color.lightGray);
        photos.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.WHITE));
        
       
       

       
    }
}
