import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Partie {
    private Personnage[] personnages;
    private Integer indicePersoChoisi;
    protected Partie (){}
    public static Partie getPartie() throws IOException{
        Partie partie; 
        final Gson gson = new GsonBuilder().create();
        try {
            String json = OuvrirFichier.ouvrir("sauvegarde.json");
            partie = gson.fromJson(json,Partie.class);
            return partie; 

        }
        catch (IOException e1) {
            System.out.println("reprise de la partie sauvegardée échouée");
            partie = new Partie(); 
            String json = OuvrirFichier.ouvrir("../personnages.json");
            partie.personnages = gson.fromJson(json,Personnage[].class);
            return partie; 
                
                
        }
        
        

    }

}


