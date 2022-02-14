public  class  Personnage  { 

	private  final Sport  sport ;  //  collectif ou individuel 
	private  final Age age ;    //  moins de 25 entre 25 et 40 plus de 40 
	private  final Nationalite  nationalite ;  //  pays 
	private final Genre  genre  ; // h ou f 
	private  final CouleurCheveux  couleurCheveux ;  //  clair foncé 
	private  final Pilosite  pilosite ;  //  barbe imberbe  
	private  final Cheveux  cheveux ;  // chauve court long 

	// Constructeurs 

	public  Personnage ( Sport sport , Age age , Nationalite  nationalite ,CouleurCheveux  couleurCheveux  , Genre  genre , Cheveux  cheveux, Pilosite  pilosite ){ 
		this.sport = sport ; 
		this.age = age ; 
		this.nationalite = nationalite ; 
		this.couleurCheveux = couleurCheveux ; 
		this.genre = genre ; 
		this.cheveux = cheveux ; 
		this.pilosite = pilosite  ; 
	}
	public Cheveux getCheveux() {
		return cheveux;
	}
	public Pilosite getPilosite() {
		return pilosite;
	}
	public CouleurCheveux getCouleurCheveux() {
		return couleurCheveux;
	}
	public Genre getGenre() {
		return genre;
	}
	public Nationalite getNationalite() {
		return nationalite;
	}
	public Sport getSport() {
		return sport;
	}
	public Age getAge() {
		return age;
	}
	}
	
 

/* Cheveux  
CHAUVE , COURT , LONG ; 
CouleurCheveux 
FONCE , CLAIR 
Genre 
MASCULIN , FEMININ 
Nationalité 
Anglaise , Allemande , Finlandaise , USA ,  Serbe , Francaise , Argentine , Irlandaise;   
Pilosite  
IMBERBE BARBE 
sport 
INDIVIDUEL COLLECTIF 
Type_Âge 
MOINS_VINGT_CINQ , ENTRE_VINGT_CINQ_ET_QUARANTE , PLUS_DE_QUARANTE 
*/ 

/*Personnage  Biles_Simone  =  new  Personnage  (  Sport . INDIVIDUEL  ,  Age . MOINS_VINGT_CINQ ,  Nationalite . USA ,  CouleurCheveux . FONCE ,  Genre . FEMININ ,  Cheveux . LONG ,  Pilosite . IMBERBE  ) ; 
Personnage  Djokovic_Novak  =  new  Personnage  (  Sport . INDIVIDUEL  ,  Age . ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite . Serbe ,  CouleurCheveux . FONCE ,  Genre . MASCULIN ,  Cheveux . COURT ,  Pilosite . BARBE  ) ; 
Personnage  Florsch_Sofia  =  new  Personnage  (  Sport . INDIVIDUEL  ,  Age . MOINS_VINGT_CINQ ,  Nationalite . Allemande ,  CouleurCheveux . CLAIR ,  Genre . FEMININ ,  Cheveux . LONG ,  Pilosite . IMBERBE  ) ; 
Personnage  Hamilton_Lewis  =  new  Personnage  (  Sport . INDIVIDUEL  ,  Age . ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite . Anglaise ,  CouleurCheveux . FONCE ,  Genre . MASCULIN ,  Cheveux . LONG ,  Pilosite . BARBE  ) ; 
Personnage  Karabatic_Nikola  =  new  Personnage  (  Sport . COLLECTIF  ,  Age . ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite . Francaise ,  CouleurCheveux . FONCE ,  Genre . MASCULIN ,  Cheveux . COURT ,  Pilosite . BARBE  ) ; 
Personnage  Laffont_Perrine  =  new  Personnage  (  Sport . INDIVIDUEL  ,  Age . MOINS_VINGT_CINQ ,  Nationalite . Francaise ,  CouleurCheveux . CLAIR ,  Genre . FEMININ ,  Cheveux . LONG ,  Pilosite . IMBERBE  ) ; 
Personnage  Lebron_James  =  new  Personnage  (  Sport . COLLECTIF  ,  Age . ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite . USA ,  CouleurCheveux . FONCE ,  Genre . MASCULIN ,  Cheveux . COURT ,  Pilosite . BARBE  ) ; 
Personnage  Manaudou_Laure  =  new  Personnage  (  Sport . INDIVIDUEL  ,  Age . ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite . Francaise ,  CouleurCheveux . FONCE ,  Genre . FEMININ ,  Cheveux . LONG ,  Pilosite . IMBERBE ) ; 
Personnage  Manaudou_Florent  =  new  Personnage  (  Sport . INDIVIDUEL  ,  Age . ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite . Francaise ,  CouleurCheveux . FONCE ,  Genre . MASCULIN ,  Cheveux . COURT ,  Pilosite . IMBERBE  ) ; 
Personnage  Mbappe_Kylian  =  new  Personnage  (  Sport . COLLECTIF  ,  Age . MOINS_VINGT_CINQ ,  Nationalite . Francaise ,  CouleurCheveux . FONCE ,  Genre . MASCULIN ,  Cheveux . COURT ,  Pilosite . IMBERBE  ) ; 
Personnage  Mcgregor_Conor  =  new  Personnage  (  Sport . INDIVIDUEL  ,  Age . ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite . Irlandaise ,  CouleurCheveux . CLAIR ,  Genre . MASCULIN ,  Cheveux . COURT ,  Pilosite . BARBE  ) ; 
Personnage  Messi_Lionel  =  new  Personnage  (  Sport . COLLECTIF  ,  Age . ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite . Argentine ,  CouleurCheveux . FONCE ,  Genre . MASCULIN ,  Cheveux . COURT ,  Pilosite . BARBE  ) ; 
Personnage  Morgan_Alex  =  new  Personnage  (  Sport . COLLECTIF  ,  Age . ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite . USA ,  CouleurCheveux . FONCE ,  Genre . FEMININ ,  Cheveux . LONG ,  Pilosite . IMBERBE  ) ; 
Personnage  Raikkonen_Kimi  =  new  Personnage  (  Sport . INDIVIDUEL  ,  Age . PLUS_DE_QUARANTE ,  Nationalite . Finlandaise ,  CouleurCheveux . FONCE ,  Genre . MASCULIN ,  Cheveux . COURT ,  Pilosite . IMBERBE  ) ; 
Personnage  Renard_Wendie  =  new  Personnage  (  Sport . COLLECTIF  ,  Age . ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite . Francaise ,  CouleurCheveux . FONCE ,  Genre . FEMININ ,  Cheveux . LONG ,  Pilosite . IMBERBE  ) ; 
Personnage  Williams_Serena  =  new  Personnage  (  Sport . INDIVIDUEL  ,  Age . ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite . USA ,  CouleurCheveux . FONCE ,  Genre . FEMININ ,  Cheveux . LONG ,  Pilosite . IMBERBE  ) ; 
Personnage  Yoka_Tony =  new  Personnage  (  Sport . INDIVIDUEL  ,  Age . ENTRE_VINGT_CINQ_ET_QUARANTE ,  Nationalite . Francaise ,  CouleurCheveux . FONCE ,  Genre . MASCULIN ,  Cheveux . COURT ,  Pilosite . BARBE  ) ; 
Personnage  Zidane_Zinedine  =  new  Personnage  (  Sport . COLLECTIF  ,  Age . PLUS_DE_QUARANTE ,  Nationalite . Francaise ,  CouleurCheveux . FONCE ,  Genre . MASCULIN ,  Cheveux . COURT ,  Pilosite . IMBERBE  ) ; */
