import com.google.gson.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
//import java.util.ArrayList; 
public class Jeu {
    private static Random random = new Random();
    private static Jeu partie; 
    private static Attribut[] attributs; 
    public String fichierSauvegarde() {return "sauvegarde.json";}
    
    private Personnage[] personnages;
    private Integer indicePersoChoisi;
    private Jeu (){}
   
    private static final String dossierImages = "../"; 
    private static String serialiserPartie(){
        final Gson gson = new GsonBuilder().create(); 
        return gson.toJson(partie);
    }
    public static Attribut[] attributs() {
        if (partie.personnages == null)
            return null ;

        if (attributs != null) 
            return attributs; 
        Personnage p = personnageChoisi();
        String[] nomsAttributs = p.clesAttributs(); 
        Set<Attribut> attributs = new HashSet<>();
        for (int i = 0; i<nomsAttributs.length;i++){
            String cle = nomsAttributs[i];
            HashSet<String> valeurs = new HashSet<>();
            for (int j = 0; j < partie.personnages.length; j++ ){
                valeurs.add(partie.personnages[i].valeurAttribut(cle)); 
                
            }
            attributs.add(new Attribut(cle,valeurs));

        }
        return attributs.toArray(new Attribut[0]); 
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
            partie.personnages = gson.fromJson(json,Personnage[].class);
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
        final Gson gson = new GsonBuilder().create();
        
        try {
            String json = OuvrirFichier.lire("sauvegarde.json");
            partie = gson.fromJson(json,partie.getClass());

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
    
    public static String getImage(String nom){
        return dossierImages + nom;

    }

}
