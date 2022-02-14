public class testQuestion {
    public static void main (String [] args){
        Personnage  Mbappe =  new  Personnage  (  Sport.COLLECTIF  ,  
            Age.MOINS_VINGT_CINQ ,  
            Nationalite.FRANCAISE ,  
            CouleurCheveux.FONCE ,  
            Genre.MASCULIN ,  Cheveux.COURT ,  Pilosite.IMBERBE  ) ; 
        Question question1 = new Question();
        assert(question1.surPersonnage(Mbappe));
        question1.ajouterAge(Age.MOINS_VINGT_CINQ);
        assert(question1.surPersonnage(Mbappe));
        Question question2 = new Question();
        question2.ajouterNationalite(Nationalite.ANGLAISE);
        question1.ou(question2);
        //question2.ou(question1); A NE PAS FAIRE A LA SUITE SINON ERREUR
        assert(question1.surPersonnage(Mbappe));
        assert ( ! question2.surPersonnage(Mbappe));
        
        
       
        System.out.println("ok");
        
                

    }
}
