import com.google.gson.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.util.ArrayList; 
public class Jeu {
    private static Personnage[] personnages;
    private static final String dossierImages = "../"; 
    private static String serialiserPersos(){
        final Gson gson = new GsonBuilder().create(); 
        return gson.toJson(personnages);
    }
    public static void sauvegarder () throws IOException{
        Files.deleteIfExists(Paths.get("sauvegarde.json"));
        Files.write(Paths.get("sauvegarde.json"),serialiserPersos().getBytes()); 
    }
    public static void testParsing(){
	parserPersonnages();
	for(int p = 0; p<personnages.length;p++){
		System.out.println(personnages[p].getPhoto());
	}
}
    private static void parserPersonnages (){
        final Gson gson = new GsonBuilder().create();
        try {
            String json = OuvrirFichier.ouvrir("sauvegarde.json");
            personnages = gson.fromJson(json,Personnage[].class);

        }
        catch (IOException e1) {
            System.out.println("reprise de la partie sauvegardée échouée");
            try {
                String json = OuvrirFichier.ouvrir("../personnages.json");
                personnages = gson.fromJson(json,Personnage[].class);
                }
                catch (IOException e){
                    System.err.println("erreur dans ouvertures du fichier personnages.json"); 
                    e.printStackTrace();
        
            
        
                }
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
