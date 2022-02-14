import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.google.gson.Gson;

public class Jeu {
    private static final Personnage personnageChoisi; 
    private static final Personnage [] personnages ; 
    public static boolean poserQuestion(Question question){
        return question.surPersonnage(personnageChoisi);
    }
    private static Personnage[] parserPersonnages() throws IOException{
        Path nomFichier = Path.of("personnages.json");
        String persosJson = Files.readString(nomFichier);
        return (new Gson().fromJson(persosJson,Personnage[].class));  



    }
    
    
}
