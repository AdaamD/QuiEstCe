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
        try {
            partie = new Jeu(); 
            String json = OuvrirFichier.ouvrir("../personnages.json");
            partie.personnages = gson.fromJson(json,Personnage[].class);
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
    }


}
