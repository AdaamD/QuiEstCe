import java.util.Set;

public class Attribut {
    private String nomAttribut;
    private String[] valeursPossibles;
    public Attribut(String nom, Set<String> valeurs){
        nomAttribut = nom;
        valeursPossibles = valeurs.toArray(String[]::new);
    }
    public String[] getOptions(){
        return valeursPossibles; 
    }
    public String getNom(){
        return nomAttribut; 
    }
    @Override
    public boolean equals(Object o){
        return o != null && o instanceof Attribut && ((Attribut)o).nomAttribut.equals(nomAttribut); 
    }
    @Override
    public int hashCode(){
        return nomAttribut.hashCode(); 

    }
}
