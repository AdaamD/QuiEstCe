import java.util.Set;

public class Attribut {
    private String nomAttribut;
    private String[] valeursPossibles;
    public Attribut(String nom, Set<String> valeurs){
        nomAttribut = nom;
        valeursPossibles = valeurs.toArray(new String[0]);
    }
    public String[] getOptions(){
        return valeursPossibles; 
    }
    public String getNom(){
        return nomAttribut; 
    }
}
