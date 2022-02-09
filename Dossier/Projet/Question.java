import java.util.function.Function;

class Question {
  
    private Function <Personnage, Boolean> condition = perso -> true ; 

    private void and (Function <Personnage,Boolean> lambdaCond){
        condition = perso -> condition.apply(perso) && lambdaCond.apply(perso) ;

    }
    private void or (Function <Personnage,Boolean> lambdaCond){
        condition = perso -> condition.apply(perso) || lambdaCond.apply(perso) ;

    }
    

    public Question(){}
    /*private Question(Function<Personnage,Boolean> lambdaCond){
        and(lambdaCond);
    }*/
    public boolean surPersonnage (Personnage personnageChoisi){
        return condition.apply(personnageChoisi);

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
    and(perso -> perso.CouleurCheveux().equals(couleur)); 
  }

    public void non(){
        condition = condition.andThen(b -> !b);
    }
    public void et(Question cond){
        and(perso -> cond.surPersonnage(perso));    

    }
    public void ou(Question cond){
        
        or(perso -> cond.surPersonnage(perso));
        
        

    }
    


}
