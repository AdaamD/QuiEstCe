import com.google.gson.*;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;
//import java.util.ArrayList; 
public class Jeu {
    private static Random random = new Random();
    private static Jeu partie; 
    private static Attribut[] attributs; 
    public String fichierSauvegarde() {return "sauvegarde.json";}
    
    private Personnage[] personnages;
    private Integer indicePersoChoisi;
    private Jeu (){}
   
    
    private static String serialiserPartie(){
        final Gson gson = new GsonBuilder().create(); 
        return gson.toJson(partie);
    }
    public static Attribut[] attributs() {
        if (partie.personnages == null)
            return null ;

        if (attributs != null) 
            return attributs; 
        attributs = personnageChoisi().clesAttributs().stream().filter(cle -> ! cle.equals("nom")).map(
                    s -> new Attribut (s,
                        Arrays.stream(partie.personnages)
                        .map(p -> p.valeurAttribut(s)).collect(Collectors.toSet())
            )).toArray(Attribut[]::new); 
        
        return attributs;

    }
    
    public static Personnage personnageChoisi(){
        if (partie.indicePersoChoisi == null) 
		 partie.indicePersoChoisi = random.nextInt (partie.personnages.length);
         return partie.personnages[partie.indicePersoChoisi]; 
		
    }
    public static void nouvellePartie(boolean custom) {
        final Gson gson = new GsonBuilder().create();
        try { 
            String json = OuvrirFichier.lire(custom ? "persosCustom.json":"../personnages.json");
            JsonObject[] personnages = gson.fromJson(json,JsonObject[].class);
            partie.personnages = Arrays.stream(personnages).map(p -> new Personnage(p)).toArray(Personnage[]::new);
            }
            catch (IOException e){
                System.err.println("erreur dans ouvertures du fichier personnages.json"); 
                e.printStackTrace();
    
        
    
            }
    }
    public static void sauvegarder () throws IOException{
        Files.deleteIfExists(Paths.get(partie.fichierSauvegarde()));
        Files.write(Paths.get("sauvegarde.json"),serialiserPartie().getBytes()); 
    }
    public static void testParsing(){
	parserPersonnages(false,true);
	for(int p = 0; p<partie.personnages.length;p++){
		System.out.println(partie.personnages[p].getPhoto());
	}
}
    private static void parserPersonnages (boolean custom,boolean nouvelle){
        partie = new Jeu();
        if (nouvelle) nouvellePartie(custom);
        else{
        final JsonParser  parser = new JsonParser(); 
        
        try {
            String json = OuvrirFichier.lire("sauvegarde.json");
            JsonArray tableauPerso = parser.parse(json).getAsJsonArray();
            partie.personnages = new Personnage[tableauPerso.size()];
            IntStream.range(0, partie.personnages.length).forEach
            (i ->partie.personnages[i] = new Personnage(tableauPerso.get(i).getAsJsonObject())); 

        }
        catch (IOException e1) {
            System.out.println("reprise de la partie sauvegardée échouée");
            nouvellePartie(custom);
        }}

    }
    public static Personnage[] getPersonnages (boolean custom, boolean nouvelle){
        if (partie == null) {
            parserPersonnages(custom,nouvelle);

        }
        return partie.personnages; 
    }
    
    

}
