import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.*; 
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.HashSet;



public class Generateur{
    private static final int NBPERSOMAX = 16;
    private static final int NBATTRMAX = 8;//nom exclu
    private static final JPanel panneauSaisie = new JPanel();
    private static final JFrame cadre = new JFrame("Generateur");
    private static JLabel indexNom = new JLabel("nom (unique)");
    private static List<JTextField> index = IntStream.range(0,NBATTRMAX).mapToObj
        (i ->new JTextField()).collect(Collectors.toList());

    private static List<List<JTextField>> persosSaisis = (IntStream.range(0,NBPERSOMAX).mapToObj
        (i -> IntStream.range(0,NBATTRMAX + 1).mapToObj(j -> new JTextField(4)).collect(Collectors.toList()))).collect(Collectors.toList());
    private static JButton exporter = new JButton("exporter les persos");
    private static boolean estVide(String s){return s == null || s.equals("");}
    private static int nbAttrRemplis(List<JTextField> ligne){ return ligne.stream().reduce(0, ((n,f) -> estVide(f.getText()) ? 0 : 1), (n,f) -> n + f);}
    /*private static boolean indexOk(){
        
        Stream<String> str = index.stream().map(f -> f.getText());
        return str.collect(Collectors.toSet()).size() == nbAttrRemplis(index); 
    }
    private static Set<String[]> persosComplets() {
        int nbA = nbAttrRemplis(index); 
        return saisiePersos.stream().filter(r -> (! estVide(r.get(0).getText()) && nbAttrRemplis(r) != nbA)).map(Streams.toArray()); 
            /*if (!estVide (saisiePersos.get(i).get(0).getText()) && nbAttrRemplis(saisiePersos.get(i)) != nbAttrRemplis(index))
                return false;
        return true; */
    private static boolean uniciteNom(){
        int compteur = 0;
        HashSet<String> dejaPris = new HashSet<>();
        boolean retour = true; 
        for (int i = 0; i < NBPERSOMAX; i++){
            System.out.println(persosSaisis.get(i).get(0).getText());
            /*String nom = persosSaisis.get(i).get(0).getText(); 
            nom = nom == null ? "" : nom.trim();
            if (nom != ""){
                System.out.println(nom.trim()); 
                retour = false;
                persosSaisis.get(i).get(0).setForeground(Color.RED);
                compteur ++; 
            }
            else {
                dejaPris.add(nom.trim());
            } */  
        }
        cadre.repaint();
        System.out.println(compteur); 
        return retour; 

    }
    public static void main (String[]args){
        String test1 = ("toto");
        HashSet set = new HashSet<>();
        set.add("toto");
        assert(set.contains(test1)); 
        exporter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                uniciteNom(); 
            }
        });
        panneauSaisie.setLayout(new GridLayout(NBPERSOMAX + 1,NBATTRMAX + 1));
        panneauSaisie.add(indexNom); 
        index.stream().forEach(champ -> panneauSaisie.add(champ)); 
        persosSaisis.stream().forEach(rangee -> rangee.stream()
            .forEach(champ -> panneauSaisie.add(champ)));
            JPanel panneauExport = new JPanel();
        panneauExport.add(exporter); 
        cadre.setLayout(new GridLayout(1,2)); 
        cadre.add(panneauSaisie);
        cadre.add(panneauExport);            
        cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadre.setVisible(true);

    }
    }