import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
public class TestTableauJson {
    public static void main (String[] args){
        Gson gson = new Gson();
        String json = "[{\"rien\" = \"quelque chose\", 'rien1' = 'quelque chose'  },{\"rien\" = \"quelque chose\"}]"; 
        JsonObject[] tableau = gson.fromJson(json,JsonObject[].class); 
        Stream.of(tableau).forEach(o -> System.out.println(o.toString())); 
    }

    
}
