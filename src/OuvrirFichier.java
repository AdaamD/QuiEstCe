import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
 
public class OuvrirFichier 
{
    
 
    //Read file content into string with - Files.readAllBytes(Path path)
    public static String ouvrir(String filePath) throws IOException
    {
        String content = "";
        content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        return content;
    }
}