
import java.io.IOException;
import com.google.gson.*;

public class PersoCustom implements PersoGenerique {
    private JsonObject attributs;
    public static PersoCustom[] lireJson(String cheminFichier)throws IOException{
        String json = OuvrirFichier.lire(cheminFichier);
        Gson gson = new Gson();
        return gson.fromJson(json,PersoCustom[].class);   

    }
    public static boolean exporterPersonnages(String destination,PersoCustom[] persos){
        Gson gson = new Gson(); 
        String json = gson.toJson(persos,PersoCustom[].class);
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
    public String [] clesAttributs(){
        return attributs.keySet().toArray(new String[0]);
    }
    public String valeurAttribut(String cle){
        return attributs.get(cle).toString();
    }
    public void setAttributs (JsonObject attributsJson){
        attributs = attributsJson;

    }
    public PersoCustom(JsonObject attributsJson){
        attributs = attributsJson; 
    }
    
}
