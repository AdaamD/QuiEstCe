import com.google.gson.*;
import java.io.IOException;
//import java.util.ArrayList; 
public class Jeu {
    private static Personnage[] personnages; 
    private static void parserPersonnage (){
        try {
        String json = OuvrirFichier.ouvrir("../../personnages.json");
        final Gson gson = new GsonBuilder().create();
        personnages = gson.fromJson(json,Personnage[].class);
        }
        catch (IOException e){
            System.err.println("erreur dans ouvertures du fichier personnages.json"); 
            e.printStackTrace();

    

        }

    }

}
