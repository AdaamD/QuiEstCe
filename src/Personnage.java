public  class  Personnage  { 

	private  final Sport  sport ;  //  collectif ou individuel 
	private  final Age age ;    //  moins de 25 entre 25 et 40 plus de 40 
	private  final Nationalite  nationalite ;  //  pays 
	private final Genre  genre  ; // h ou f 
	private  final CouleurCheveux  couleurCheveux ;  //  clair foncé 
	private  final Pilosite  pilosite ;  //  barbe imberbe  
	private  final Cheveux  cheveux ;// chauve court long 
	private String nom; //final en pratique 
	private String image; //final en pratique
	private boolean coche;
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
	public  Personnage ( Sport sport , Age age , Nationalite  nationalite ,CouleurCheveux  couleurCheveux  , Genre  genre , Cheveux  cheveux, Pilosite  pilosite
	, String nom, String image ){ 
		this.sport = sport ; 
		this.age = age ; 
		this.nationalite = nationalite ; 
		this.couleurCheveux = couleurCheveux ; 
		this.genre = genre ; 
		this.cheveux = cheveux ; 
		this.pilosite = pilosite  ; 
		this.nom = nom;
		this.image = image; 
		
	}

	@Override
	public String toString(){
		return nom; 

	}
	public String getNom(){
		return nom; 
	}
	
	public String getPhoto() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
	public boolean cocherOuDecocher(){
		return coche = !coche ;
	}
	public boolean estCoche(){
		return coche; 
	}

}
