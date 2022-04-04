import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
public interface PersoGenerique {
    static JsonObject[] lireJson(String cheminFichier)throws IOException{
        String json = OuvrirFichier.lire(cheminFichier);
        Gson gson = new Gson();
        return gson.fromJson(json,JsonObject[].class);   

    }
    
        
    String[] clesAttributs();
    String valeurAttribut(String attribut);
    void setAttributs(JsonObject attributs);
    String getNom(); 
    String getPhoto(); 
    boolean cocherOuDecocher();
    boolean estCoche(); 
}

