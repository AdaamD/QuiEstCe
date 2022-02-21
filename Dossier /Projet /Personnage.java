public  class  Personnage  { 

	private final String nom; //nom et prénom du personnage
	private  final Sport  sport ;  //  collectif ou individuel 
	private  final Age age ;    //  moins de 25 entre 25 et 40 plus de 40 
	private  final Nationalite  nationalite ;  //  pays 
	private final Genre  genre  ; // h ou f 
	private  final CouleurCheveux  couleurCheveux ;  //  clair foncé 
	private  final Pilosite  pilosite ;  //  barbe imberbe  
	private  final Cheveux  cheveux ;// chauve court long 
	private  String nom; //final en pratique 

	// Constructeurs 

	public  Personnage ( String nom,Sport sport , Age age , Nationalite  nationalite ,CouleurCheveux  couleurCheveux  , Genre  genre , Cheveux  cheveux, Pilosite  pilosite ){ 
		this.nom = nom;
		this.sport = sport ; 
		this.age = age ; 
		this.nationalite = nationalite ; 
		this.couleurCheveux = couleurCheveux ; 
		this.genre = genre ; 
		this.cheveux = cheveux ; 
		this.pilosite = pilosite  ; 
	}
	
	public String getNom(String nom){
		return nom ; 
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
