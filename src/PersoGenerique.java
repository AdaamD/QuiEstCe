import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
public interface PersoGenerique {

    String[] clesAttributs();
    String valeurAttribut(String attribut);
    void setAttributs(JsonObject attributs);
    String getNom(); 
    String getPhoto(); 
    boolean cocherOuDecocher();
    boolean estCoche(); 
}

