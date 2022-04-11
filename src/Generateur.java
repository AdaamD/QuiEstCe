import java.io.IOException;
import java.util.Set;

import com.google.gson.*;

public class Personnage{
    private JsonObject attributs;
    public static Personnage[] lireJson(String cheminFichier)throws IOException{
        String json = OuvrirFichier.lire(cheminFichier);
        Gson gson = new Gson();
        return gson.fromJson(json,Personnage[].class);   

    }
    public static boolean exporterPersonnages(String destination,Personnage[] persos){
        Gson gson = new Gson(); 
        String json = gson.toJson(persos,Personnage[].class);
        try {
            OuvrirFichier.ecraserAvec(destination, json);
            return true; 
        }
        catch (IOException ioe){
            System.out.println("Erreur dans exports de personnages");
            ioe.printStackTrace();
            return false; 

        }
       
    }
    public Personnage(String[]cles,String[] valeurs){
        JsonObject json = new JsonObject();
        for (int i = 0; i < cles.length; i++){
            json.addProperty(cles[i],valeurs[i]);
        
        }
        attributs = json; 
    }
    public String[]  clesAttributs(){
        return attributs.keySet().toArray(new String[0]);
    }
    public String valeurAttribut(String cle){
        return attributs.get(cle).toString();
    }
    public String getPhoto(){
        return valeurAttribut("image"); 
    }
    public String getNom(){
        return valeurAttribut("nom"); 
    }
    public void setAttributs (JsonObject attributsJson){
        attributs = attributsJson;

    }
    
    public boolean cocherOuDecocher(){
		boolean nouvelEtat = !estCoche(); 
		attributs.addProperty("coche",nouvelEtat); 
		return nouvelEtat; 
       

    }
    public boolean estCoche(){
		JsonPrimitive coche = attributs.getAsJsonPrimitive("coche") ; 
		return coche.isBoolean() && coche.getAsBoolean(); 
		
		
    }
	
}
