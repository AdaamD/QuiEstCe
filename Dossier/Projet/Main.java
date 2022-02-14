import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
import java.util.ArrayList; 
import java.util.Random;


public class Main 
{

    // Fonction choix d'un nb aléatoire
    public static  int Choixalea(){
        Random random = new Random();
        int nb_Alea = random.nextInt(18);
        return nb_Alea;
    }


    public static void main(String[] args) 
    {

        //création des perso

        Personnage  Biles_Simone  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.MOINS_VINGT_CINQ ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ; 
        Personnage  Djokovic_Novak  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.SERBE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ; 
        Personnage  Florsch_Sofia  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.MOINS_VINGT_CINQ ,  Nationalite.ALLEMANDE ,  CouleurCheveux.CLAIR ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ; 
        Personnage  Hamilton_Lewis  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.ANGLAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.LONG ,  Pilosite.BARBE  ) ; 
        Personnage  Karabatic_Nikola  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ; 
        Personnage  Laffont_Perrine  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.MOINS_VINGT_CINQ ,  Nationalite.FRANCAISE ,  CouleurCheveux.CLAIR ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ; 
        Personnage  Lebron_James  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ; 
        Personnage  Manaudou_Laure  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.FEMININ ,  Cheveux . LONG ,  Pilosite . IMBERBE ) ; 
        Personnage  Manaudou_Florent  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.IMBERBE  ) ; 
        Personnage  Mbappe_Kylian  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.MOINS_VINGT_CINQ ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.IMBERBE  ) ; 
        Personnage  Mcgregor_Conor  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.IRLANDAISE ,  CouleurCheveux.CLAIR ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ; 
        Personnage  Messi_Lionel  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.ARGENTINE ,  CouleurCheveux.FONCE ,  Genre . MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ; 
        Personnage  Morgan_Alex  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ; 
        Personnage  Raikkonen_Kimi  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.PLUS_DE_QUARANTE ,  Nationalite.FINLANDAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.IMBERBE  ) ; 
        Personnage  Renard_Wendie  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ; 
        Personnage  Williams_Serena  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.FEMININ ,  Cheveux.LONG ,  Pilosite.IMBERBE  ) ; 
        Personnage  Yoka_Tony =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.BARBE  ) ; 
        Personnage  Zidane_Zinedine  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.PLUS_DE_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.IMBERBE  ) ; 
        

        ArrayList<Personnage> liste_perso = new ArrayList<Personnage> ();
        liste_perso.add(Zidane_Zinedine);
        liste_perso.add(Biles_Simone);
        liste_perso.add(Djokovic_Novak);
        liste_perso.add(Florsch_Sofia);
        liste_perso.add(Hamilton_Lewis);
        liste_perso.add(Karabatic_Nikola);      
        liste_perso.add(Laffont_Perrine);
        liste_perso.add(Lebron_James);      
        liste_perso.add(Manaudou_Laure);
        liste_perso.add(Manaudou_Florent);      
        liste_perso.add(Mbappe_Kylian);         
        liste_perso.add(Mcgregor_Conor);        
        liste_perso.add(Messi_Lionel);          
        liste_perso.add(Morgan_Alex);
        liste_perso.add(Raikkonen_Kimi);        
        liste_perso.add(Renard_Wendie);
        liste_perso.add(Williams_Serena);       
        liste_perso.add(Yoka_Tony);


        // PREND UN PERSO AU HASARD
        int i= Choixalea();
        Personnage perso = liste_perso.get(i);
        System.out.println(liste_perso.get(i));








        // Définissez le nom de l'interface graphique 
        JFrame frame = new JFrame("Qui est ce ??");


//Creéer un panel 
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

            // Définir le menu principal
        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("Fichier");
        JMenu edit = new JMenu("Edition");
        JMenu help = new JMenu("Aide");

        
        // Définir le sous-menu pour Fichier
        JMenuItem newf = new JMenuItem("Nouveau");
        JMenuItem open = new JMenuItem("Ouvrir");
        JMenuItem save = new JMenuItem("Enregistrer");
        JMenuItem quit = new JMenuItem("Quitter");


        frame.add(menu);
        file.add(newf);
        file.add(save);
        file.add(quit);
        quit.addActionListener(e -> { frame.dispose();});

        menu.add(file);
        menu.add(edit);
        menu.add(help);





         // Définir les images
        //ImageIcon biles= new ImageIcon(new ImageIcon("biles.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        ImageIcon djokovic= new ImageIcon(new ImageIcon("djokovic.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        //ImageIcon florsch= new ImageIcon(new ImageIcon("florsch.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        ImageIcon hamilton= new ImageIcon(new ImageIcon("hamilton.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        ImageIcon karabatic= new ImageIcon(new ImageIcon("karabatic.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        ImageIcon laffont= new ImageIcon(new ImageIcon("laffont.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        ImageIcon lebron= new ImageIcon(new ImageIcon("lebron.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        ImageIcon lmanaudou= new ImageIcon(new ImageIcon("lmanaudou.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        ImageIcon manaudou= new ImageIcon(new ImageIcon("manaudou.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        ImageIcon mbappe= new ImageIcon(new ImageIcon("mbappe.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT)); 
        ImageIcon mcgregor= new ImageIcon(new ImageIcon("mcgregor.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));   
        ImageIcon messi= new ImageIcon(new ImageIcon("messi.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));      
        ImageIcon morgan= new ImageIcon(new ImageIcon("morgan.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));  
        ImageIcon raikonen= new ImageIcon(new ImageIcon("raikonen.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        ImageIcon renard= new ImageIcon(new ImageIcon("renard.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        ImageIcon williams= new ImageIcon(new ImageIcon("williams.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        ImageIcon yoka= new ImageIcon(new ImageIcon("yoka.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        ImageIcon zidane= new ImageIcon(new ImageIcon("zidane.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));

        //définir les boutons 
        //JButton biles1 = new JButton(biles);
        JButton djokovic1 = new JButton(djokovic);
        //JButton florsch1 = new JButton(florsch);
        JButton hamilton1 = new JButton(hamilton);
        JButton karabatic1 = new JButton(karabatic);
        JButton laffont1 = new JButton(laffont);
        JButton lebron1 = new JButton(lebron);
        JButton lmanaudou1 = new JButton(lmanaudou);
        JButton manaudou1 = new JButton(manaudou);
        JButton mbappe1 = new JButton(mbappe);
        JButton mcgregor1 = new JButton(mcgregor);
        JButton messi1 = new JButton(messi);
        JButton morgan1 = new JButton(morgan);
        JButton raikonen1 = new JButton(raikonen);
        JButton renard1 = new JButton(renard);
        JButton williams1 = new JButton(williams);
        JButton yoka1 = new JButton(yoka);
        JButton zidane1 = new JButton(zidane);




         // Ajouter les boutons au frame
        panel1.add(djokovic1); 
        panel1.add(hamilton1);
        panel1.add(karabatic1);
        panel1.add(laffont1);
        panel2.add(lebron1); 
        panel2.add(lmanaudou1);
        panel2.add(manaudou1);
        panel2.add(mbappe1);
        panel3.add(mcgregor1);
        panel3.add(messi1);
        panel3.add(morgan1);
        panel3.add(raikonen1);
        panel4.add(renard1);
        panel4.add(williams1);
        panel4.add(yoka1);
        panel4.add(zidane1);






        JLabel label = new JLabel("BIENVENUE SUR QUI-EST-CE?", JLabel.CENTER);

        // Ajouter label et panel au frame
        //nom_Interface.setLayout(new GridLayout(10, 1));
        frame.add(label);
        






        frame.setLayout(new GridLayout(7,1));
        


        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        JPanel question = new JPanel();


        Nationalite[] items = {Nationalite.ANGLAISE, Nationalite.ALLEMANDE, Nationalite.FINLANDAISE,
        Nationalite.USA, Nationalite.SERBE , Nationalite.ARGENTINE, Nationalite.IRLANDAISE,Nationalite.FRANCAISE };

        JComboBox cb = new JComboBox(items);

        //fonction renvoie boolean vrai
        //si la valeur selectionné est egale
        // a la valeur du perso 
        JLabel label1 = new JLabel("ooooook c'est bon c'est ca ", JLabel.CENTER);
        JLabel label2 = new JLabel("PAS DU TOUT C'EST FAUX !! ", JLabel.CENTER);



        cb.addActionListener(new ActionListener() {     
            @Override
            public void actionPerformed(ActionEvent e) {

                if(cb.getSelectedItem()== perso.getNationalite())
                {   
                    System.out.println("ok");
                    frame.add(label1);
                    label1.setVisible(true);
                    label2.setVisible(false);
                    frame.setLayout(new GridLayout(7,1));
                } 
                else {
                    System.out.println("Nooon");
                    frame.add(label2);
                    label2.setVisible(true);
                    label1.setVisible(false);
                    frame.setLayout(new GridLayout(7,1));}
                } 
            });

        question.add(cb);
        frame.add(question);


        frame.pack();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
