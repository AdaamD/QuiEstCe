import com.google.gson.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
//import java.util.ArrayList; 
public class Jeu {
    private static Random random = new Random();
    private static Jeu partie; 
    private Personnage[] personnages;
    private Integer indicePersoChoisi;
    private Jeu (){}
   
    private static final String dossierImages = "../"; 
    private static String serialiserPartie(){
        final Gson gson = new GsonBuilder().create(); 
        return gson.toJson(partie);
    }
    
    public static Personnage personnageChoisi(){
        if (partie.indicePersoChoisi == null) 
		 partie.indicePersoChoisi = random.nextInt (partie.personnages.length);
         return partie.personnages[partie.indicePersoChoisi]; 
		
    }

    public static void sauvegarder () throws IOException{
        Files.deleteIfExists(Paths.get("sauvegarde.json"));
        Files.write(Paths.get("sauvegarde.json"),serialiserPartie().getBytes()); 
    }
    public static void testParsing(){
	parserPersonnages();
	for(int p = 0; p<partie.personnages.length;p++){
		System.out.println(partie.personnages[p].getPhoto());
	}
}
    private static void parserPersonnages (){
        final Gson gson = new GsonBuilder().create();
        try {
            String json = OuvrirFichier.ouvrir("sauvegarde.json");
            partie = gson.fromJson(json,Jeu.class);

        }
        catch (IOException e1) {
            System.out.println("reprise de la partie sauvegardée échouée");
            try {
                partie = new Jeu(); 
                String json = OuvrirFichier.ouvrir("../personnages.json");
                partie.personnages = gson.fromJson(json,Personnage[].class);
                }
                catch (IOException e){
                    System.err.println("erreur dans ouvertures du fichier personnages.json"); 
                    e.printStackTrace();
        
            
        
                }
        }

    }
    public static Personnage[] getPersonnages (){
        if (partie == null) {
            parserPersonnages();

        }
        return partie.personnages; 
    }
    public static String getImage(String nom){
        return dossierImages + nom;

    }

}
