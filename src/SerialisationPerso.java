import com.google.gson.*; 
public class SerialisationPerso {
    public static void main (String[] args){
        final Gson gson = new GsonBuilder().create(); 
        /*Personnage  BS =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.MOINS_VINGT_CINQ ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.FEMININ  
            ,Cheveux.LONG ,  Pilosite.IMBERBE, "Biles Simone","simone.jpg"  ) ; */
		Personnage  DN  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.SERBE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN 
            , Cheveux.COURT ,  Pilosite.BARBE, "Novak Djokovic", "djokovic.jpg" ) ; 
		/*Personnage  FS =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.MOINS_VINGT_CINQ ,  Nationalite.ALLEMANDE ,  CouleurCheveux.CLAIR ,  Genre.FEMININ
        ,  Cheveux.LONG,  Pilosite.IMBERBE,"Sofia FLorsch","florsch.jpg"  ) ; */
		Personnage  HL =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.ANGLAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN
        ,  Cheveux.LONG ,  Pilosite.BARBE, "Lewis Hamilton", "hamilton.jpg"  ) ; 
		Personnage  KN  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN
        ,  Cheveux.COURT ,  Pilosite.BARBE, "Nikola Karabatic", "karabatic.jpg" ) ; 
		Personnage  LP =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.MOINS_VINGT_CINQ ,  Nationalite.FRANCAISE ,  CouleurCheveux.CLAIR ,  Genre.FEMININ
        ,  Cheveux.LONG ,  Pilosite.IMBERBE, "Perrine Laffont", "laffont.jpg"  ) ; 
		Personnage  LJ =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.MASCULIN
        ,  Cheveux.COURT ,  Pilosite.BARBE, "James Lebron", "lebron.jpg"  ) ; 
		Personnage  ML =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.FEMININ
        ,  Cheveux . LONG ,  Pilosite . IMBERBE, "Laure Manaudou", "lmanaudou.jpg" ) ; 
		Personnage  MF  =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN
        ,  Cheveux.COURT ,  Pilosite.IMBERBE, "Flaurent Manaudou", "manaudou.jpg"  ) ; 
		Personnage  MK =  new  Personnage  (  Sport.COLLECTIF  ,  Age.MOINS_VINGT_CINQ ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN
        ,  Cheveux.COURT ,  Pilosite.IMBERBE,"Kyllian MBappe","mbappe.jpg" ) ; 

		Personnage  MC =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.IRLANDAISE ,  CouleurCheveux.CLAIR ,  Genre.MASCULIN
        ,  Cheveux.COURT ,  Pilosite.BARBE, "Connor McGregor", "mcgregor.jpg"  ) ; 
		Personnage  MeL  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.ARGENTINE ,  CouleurCheveux.FONCE ,  Genre . MASCULIN
        ,  Cheveux.COURT ,  Pilosite.BARBE, "Lionel Messi", "messi.jpg" ) ; 
		Personnage  MA =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.FEMININ 
        ,  Cheveux.LONG ,  Pilosite.IMBERBE,"Alex Morgan", "morgan.jpg"  ) ; 
		Personnage  RK =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.PLUS_DE_QUARANTE ,  Nationalite.FINLANDAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN
        ,  Cheveux.COURT ,  Pilosite.IMBERBE, "Kimi Raikkonen", "raikkonen.jpg" ) ; 
		Personnage  RW =  new  Personnage  (  Sport.COLLECTIF  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.FEMININ
        ,  Cheveux.LONG ,  Pilosite.IMBERBE, "Wendie Renard", "renard.jpg") ; 
		Personnage  WS =  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.USA ,  CouleurCheveux.FONCE ,  Genre.FEMININ
        ,  Cheveux.LONG ,  Pilosite.IMBERBE, "Serena Williams", "williams.jpg"  ) ; 
		Personnage  YT=  new  Personnage  (  Sport.INDIVIDUEL  ,  Age.ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN
        ,  Cheveux.COURT ,  Pilosite.BARBE, "Tony Yoka","yoka.jpg") ; 
		Personnage  ZZ  =  new  Personnage  (  Sport.COLLECTIF  ,  Age.PLUS_DE_QUARANTE ,  Nationalite.FRANCAISE ,  CouleurCheveux.FONCE ,  Genre.MASCULIN,
          Cheveux.COURT ,  Pilosite.IMBERBE, "Zinedine Zidane", "zidane.jpg"  ) ; 


        final Personnage[] persos = {DN, HL,KN,LP,LJ,ML,MF,MK,MC,MeL,MA,RK,RW,WS,YT,ZZ};
        System.out.println(gson.toJson(persos)); 
    }
    
}
