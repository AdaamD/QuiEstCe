import java.awt.event.*;

import javax.swing.JComboBox;

public class ListeValeurs extends JComboBox <String> {
    private String nomAttribut; 

    public static ListeValeurs[] listes() {
        Attribut[] as = Jeu.attributs();  
        int n = as.length; 
        ListeValeurs retour[] = new ListeValeurs[n]; 
        for (int i = 0; i<n;i++)
        {   
            retour[i] = new ListeValeurs(as[i]); 

        }
        return retour; 

    }
    private ListeValeurs(String nomAttribut,String[] valeursPossibles){
        super(valeursPossibles); 
        addActionListener(new ActionListener() {     
            //	@Override
                public void actionPerformed(ActionEvent e) {
    
                    if(getSelectedItem().equals(Jeu.personnageChoisi().valeurAttribut(nomAttribut)))
                    { Main.repondreOui();
                        
                    } 
                    else {
                        Main.repondreNon();
                    }
                } 
            });
    }
    private ListeValeurs(Attribut attribut){
        this(attribut.getNom(),attribut.getOptions()); 
    }
    }

