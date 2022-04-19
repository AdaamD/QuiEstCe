import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;



public class Generateur{
    private static final JLabel fichierExport = new JLabel("Fichier d'export: "+OuvrirFichier.fichierPersosCustom);
    private static final JLabel dossierImage = new JLabel("Les images doivent etre placees dans: "+OuvrirFichier.dossierImages); 
    private static final int NBPERSOMAX = 16;
    private static final Gson gson = new GsonBuilder().create(); 
    private static final int NBATTRMAX = 8;//nom exclu
    private static final JPanel panneauSaisie = new JPanel();
    private static final JFrame cadre = new JFrame("Generateur");
    private static JLabel indexNom = new JLabel("nom (unique)");
    private static JLabel indexImage = new JLabel("nom image");
    private static List<JTextField> index = IntStream.range(0,NBATTRMAX).mapToObj
    
        (i ->new JTextField()).collect(Collectors.toList());

    private static List<List<JTextField>> persosSaisis = (IntStream.range(0,NBPERSOMAX).mapToObj
        (i -> IntStream.range(0,NBATTRMAX + 2).mapToObj(j -> new JTextField(20)).collect(Collectors.toList()))).collect(Collectors.toList());
    private static JButton exporter = new JButton("exporter les persos");
    private static boolean estVide(String s){return s == null || s.equals("");}
    private static int nbAttrRemplis(List<JTextField> ligne){ return ligne.stream().reduce(0, ((n,f) -> estVide(f.getText()) ? 0 : 1), (n,f) -> n + f);}
    private static boolean indexOk(){
        
        Stream<String> str = index.stream().map(f -> f.getText());
        return str.collect(Collectors.toSet()).size() == nbAttrRemplis(index); 
    }
    
    /*private static Set<String[]> persosComplets() {
        int nbA = nbAttrRemplis(index); 
        return saisiePersos.stream().filter(r -> (! estVide(r.get(0).getText()) && nbAttrRemplis(r) != nbA)).map(Streams.toArray()); 
            if (!estVide (saisiePersos.get(i).get(0).getText()) && nbAttrRemplis(saisiePersos.get(i)) != nbAttrRemplis(index))
                return false;
        return true; */
    private static String trim(String chaine){
        return chaine == null ? "" : chaine.trim();
    }
    private static boolean uniciteValeur(Stream<JTextField> flux, Color couleurErreur){
        HashSet<String> dejaPris = new HashSet<>(); 
        return flux.map(champ ->
            {
            String nom = trim(champ.getText()); 
            if (! nom.equals("")){
                if (dejaPris.contains(nom)){
                champ.setForeground(couleurErreur); 
                return false;
                
            }
                else {
                    dejaPris.add(nom);//pourrait être hors du else et fonctionner

            } 
            
            
        }
        champ.setForeground(Color.BLACK);//pas sûr de comprendre pourquoi c'est nécessaire
        return true;
        
    }).reduce(true,(u1,u2) -> u1 && u2);
     }
    public static void main (String[]args){
        exporter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                boolean uniciteNoms = uniciteValeur(persosSaisis.stream().map(rangee -> rangee.get(0)),Color.RED); 
                uniciteValeur(persosSaisis.stream().map(rangee -> rangee.get(1)),Color.ORANGE); 
                System.out.println(uniciteNoms); 
                JsonArray tableauJson = new JsonArray();
                if (uniciteNoms){
        

                    IntStream.range(0,NBPERSOMAX)
                    .filter(i -> ! trim (persosSaisis.get(i).get(0).getText()).isEmpty()).mapToObj(
                            ligne -> {JsonObject perso = new JsonObject();
                                    perso.addProperty("nom", persosSaisis.get(ligne).get(0).getText());
                                    perso.addProperty("image",persosSaisis.get(ligne).get(1).getText()); 
                                    IntStream.range(2,NBATTRMAX)
                                        .filter(colonne -> ! trim (index.get(colonne - 2).getText()).isEmpty()).forEach(colonne -> 
                                        perso.addProperty (index.get(colonne - 2).getText(),persosSaisis.get(ligne).get(colonne).getText()));
                                return perso;

                    }
                    ).forEach(obj -> tableauJson.add(obj)); 
                    String tableau = gson.toJson(tableauJson); 
                    try {
                    OuvrirFichier.ecraserAvec(OuvrirFichier.fichierPersosCustom, 
        
                        tableau);
                    }
                    catch (IOException io){
                        System.err.println("erreur dans l'export");
                        io.printStackTrace();
                    }
                    System.out.println(tableau);

                }
            }
        });
        panneauSaisie.setLayout(new GridLayout(NBPERSOMAX + 2,NBATTRMAX + 2));
        panneauSaisie.add(indexNom);
        panneauSaisie.add(indexImage);

        index.get(0).setName("nom atttribut 1");
        index.get(1).setName("nom atttribut 2");

        index.stream().forEach(champ -> panneauSaisie.add(champ)); 
        persosSaisis.stream().forEach(rangee -> rangee.stream()
            .forEach(champ -> panneauSaisie.add(champ)));
            JPanel panneauExport = new JPanel();
        panneauExport.setLayout(new GridLayout(4,1));
        panneauExport.add(exporter); 
        panneauExport.add(fichierExport);
        panneauExport.add(dossierImage); 
        cadre.setLayout(new GridLayout(1,2)); 
        cadre.add(panneauSaisie);
        cadre.add(panneauExport);            
        cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadre.setSize(1800,600); 
        cadre.setVisible(true);
        

    }
    }