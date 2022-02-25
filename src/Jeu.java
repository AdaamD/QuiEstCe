import com.google.gson.*;
import java.io.IOException;
//import java.util.ArrayList; 
public class Jeu {
    private static Personnage[] personnages;
    private static final String dossierImages = "../"; 
    public static void testParsing(){
	parserPersonnages();
	for(int p = 0; p<personnages.length;p++){
		System.out.println(personnages[p].getPhoto());
	}
}
    private static void parserPersonnages (){
        try {
        String json = OuvrirFichier.ouvrir("../personnages.json");
        final Gson gson = new GsonBuilder().create();
        personnages = gson.fromJson(json,Personnage[].class);
        }
        catch (IOException e){
            System.err.println("erreur dans ouvertures du fichier personnages.json"); 
            e.printStackTrace();

    

        }

    }
    public static Personnage[] getPersonnages (){
        if (personnages == null) {
            parserPersonnages();

        }
        return personnages; 
    }
    public static String getImage(String nom){
        return dossierImages + nom;

    }

}
