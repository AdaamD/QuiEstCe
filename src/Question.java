import java.util.function.*;

class Question {
  
    private Function <Personnage, Boolean> condition = perso -> true ; 
  
    private static <T,U,V,W> Function<T,W> bind (Function<T,U> ftu,Function<T,V> ftv, BiFunction<U,V,W> fuvw){
      return (t -> fuvw.apply(ftu.apply(t),ftv.apply(t)));

    }
    

    private void and (Function <Personnage,Boolean> lambdaCond){
        condition = bind(condition,lambdaCond,((b1,b2) -> b1 && b2));

    }
    private void or (Function <Personnage,Boolean> lambdaCond){
        condition = bind(condition,lambdaCond,((b1,b2) -> b1 || b2));;

    }
    

    public Question(){}
    /*private Question(Function<Personnage,Boolean> lambdaCond){
        and(lambdaCond);
    }*/
    public boolean surPersonnage (Personnage personnageChoisi){
        return condition.apply(personnageChoisi);

    }
    public boolean poserQuestion (Personnage personnageChoisi){
      return surPersonnage(personnageChoisi);
    }

    public void ajouterGenre(Genre genre){
       and(perso -> perso.getGenre().equals(genre));   
        
    }
   public void ajouterSport(Sport sport){
       and(perso -> perso.getSport().equals(sport));   
        
    }
  public void ajouterNationalite(Nationalite nationalite){
       and(perso -> perso.getNationalite().equals(nationalite));   
        
    }
  public void ajouterCheveux(Cheveux cheveux){
    and(perso -> perso.getCheveux().equals(cheveux)); 
  }
  public void ajouterAge(Age age){
    and(perso -> perso.getAge().equals(age)); 
  }
   public void ajouterPilosite(Pilosite pilosite){
    and(perso -> perso.getPilosite().equals(pilosite)); 
  }
  public void ajouterCouleurCheveux(CouleurCheveux couleur){
    and(perso -> perso.getCouleurCheveux().equals(couleur)); 
  }

    public void non(){
        condition.andThen(b -> !b);
    }
    public void et(Question cond){
        and(perso -> cond.surPersonnage(perso));    

    }
    public void ou(Question cond){
        
        or(perso -> cond.surPersonnage(perso));
        
        

    }
    


}
