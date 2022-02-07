import java.util.function.Function;

class Question {
  
    private Function <Personnage, Pair<Personnage,Boolean>> condition = perso -> new Pair<>(perso,true); 

    private void and (Function <Personnage,Boolean> lambdaCond){
        condition = condition.andThen(pair -> pair.changeRight(pair.getRight() & lambdaCond.apply(pair.getLeft())));

    }
    private void or (Function <Personnage,Boolean> lambdaCond){
        condition = condition.andThen(pair -> pair.changeRight(pair.getRight() | lambdaCond.apply(pair.getLeft())));

    }
    

    public Question(){}
    /*private Question(Function<Personnage,Boolean> lambdaCond){
        and(lambdaCond);
    }*/
    public boolean poserQuestion(Personnage personnageChoisi){
        return condition.apply(personnageChoisi).getRight();

    }

    public void ajouterGenre(Genre genre){
       and(perso -> perso.getGenre().equals(genre));   
        
    }

    public void non(){
        condition = condition.andThen(pair -> new Pair<>(pair.getLeft(),!pair.getRight()));
    }
    public void et(Question cond){
        and(perso -> cond.poserQuestion(perso));    

    }
    public void ou(Question cond){
        or(perso -> cond.poserQuestion(perso));

    }
    

    





}
