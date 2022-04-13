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
    public Personnage (JsonObject json){
        attributs = json; 
    }
    public Set<String>  clesAttributs(){
        return attributs.keySet();
    }
    public String valeurAttribut(String cle){
        return attributs.get(cle).getAsString();
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
		return coche != null  && coche.getAsBoolean(); 
		
		
    }
//Pour garder la compatitbilité avec les vieilles versions programmes
    public Age getAge(){
        return Age.valueOf(valeurAttribut("age"));
    }
    public Cheveux getCheveux(){
        return Cheveux.valueOf(valeurAttribut("cheveux"));
    }
    public CouleurCheveux getCouleurCheveux(){
        return CouleurCheveux.valueOf(valeurAttribut("couleurCheveux"));
    }
    public Genre getGenre(){
        return Genre.valueOf(valeurAttribut("genre")); 
    }
    public Nationalite getNationalite(){
        return Nationalite.valueOf(valeurAttribut("nationalite"));
    }
    public Pilosite getPilosite(){
        return Pilosite.valueOf(valeurAttribut("pilosite"));
    }
    public Sport getSport(){
        return Sport.valueOf(valeurAttribut("sport")); 
    }
    @Override
    public String toString(){
        return getNom(); 
    }
	
}
