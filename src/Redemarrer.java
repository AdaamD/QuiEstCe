import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Redemarrer {
    public static void nouvellePartiePersosCustom(){
        Redemarrer("java -cp .:gson-2.8.2.jar Main c n "); 
    }
    public static void nouvellePartiePersosBase(){
        Redemarrer("java -cp .:gson-2.8.2.jar Main n "); 
    }
    public static void Redemarrer(String commande){
        try {
			Process processus = Runtime.getRuntime().exec(commande); 
			
			StringBuilder resultat = new StringBuilder(); 
			
			BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream())); 
			
			String ligne;
			
			while ((ligne = lecteur.readLine()) != null) {
				resultat.append(ligne + "\n"); 
			}
			
			int valeurDeSortie = processus.waitFor();
			if (valeurDeSortie == 0) {
				System.out.println("Success!");
				System.out.println(resultat); 
				System.exit(0);
			} else {
				System.out.println("Quelque chose d'annormal'est produit :( "); 
			}
				
		} catch (IOException t) {
			t.printStackTrace();
		} catch (InterruptedException t) {
			t.printStackTrace();
		}
    }
    
}
