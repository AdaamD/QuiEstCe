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
