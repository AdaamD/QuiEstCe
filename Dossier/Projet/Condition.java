import java.util.function.Function;

class Condition {
    /*private boolean absurde; 
    private Genre genre;
    private Nationnalite nationnalite;
    private Sport sport;
    private Genre genre; 
    private Pilosite pilosite; 
    private CouleurCheuveux couleurCheveux;
    private Cheveux cheveux;
    private Age age;*/
    private Function <Personnage, Pair<Personnage,Boolean>> condition = perso -> new Pair<>(perso,true); 


    private void not(){
        condition = condition.andThen(pair -> new Pair<>(pair.getLeft(),!pair.getRight()));
    }
    private void and (Function <Personnage,Boolean> lambdaCond){
        condition = condition.andThen(pair -> pair.changeRight(lambdaCond.apply(pair.getLeft())));


    }
    public void ajouterGenre(Genre genre){
       and(perso -> perso.getGenre().equals(genre));
        
        
    }


    public Condition(){}
    private Condition(Function<Personnage,Boolean> lambdaCond){
        and(lambdaCond);
    }
    public boolean testerCondtion(Personnage personnageChoisi){
        return condition.apply(personnageChoisi).getRight();

    }





}