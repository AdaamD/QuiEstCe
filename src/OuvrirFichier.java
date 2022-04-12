import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
 
public class OuvrirFichier 
{
    public static final String dossierImages = "../"; 
    public static final String imageCroix = dossierImages + "croix.jpg";
    public static String getImage(String nomImage){
        return dossierImages + nomImage;
    }
 
    //Read file content into string with - Files.readAllBytes(Path path)
    public static String lire(String filePath) throws IOException
    {
        String content = "";
        content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        return content;
    }
    public static void ecraserAvec(String chemin, String contenu)throws IOException {
        Files.deleteIfExists(Paths.get(chemin));
                        Files.write(Paths.get(chemin),contenu.getBytes());

    }
}