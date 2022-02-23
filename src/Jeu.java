import com.google.gson.*;
import java.io.IOException;
//import java.util.ArrayList; 
public class Jeu {
    private static Personnage[] personnages; 
    public static void testParsing(){
	parserPersonnages();
	for(int p = 0; p<personnages.length;p++){
		System.out.println(personnages[p].getImage());
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

}
