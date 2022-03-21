public  class  Personnage  { 

	private   Sport  sport ;  //  collectif ou individuel 
	private   Age age ;    //  moins de 25 entre 25 et 40 plus de 40 
	private   Nationalite  nationalite ;  //  pays 
	private  Genre  genre  ; // h ou f 
	private   CouleurCheveux  couleurCheveux ;  //  clair foncé 
	private   Pilosite  pilosite ;  //  barbe imberbe  
	private   Cheveux  cheveux ;// chauve court long 
	private String nom; //final en pratique 
	private String image; //final en pratique

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

	public Personnage () {}

	@Override
	public String toString(){
		return  nom ; 

	}

	public String toStringGen(){
		return  nom + "\n" + nationalite + "\n" + sport + "\n" + age + "\n" + genre + "\n" + couleurCheveux + "\n" + pilosite + "\n" + cheveux + "\n" + image ; 

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

}
