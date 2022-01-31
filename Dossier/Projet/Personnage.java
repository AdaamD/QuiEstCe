public class Personnage {

	private String Type_de_sport; // collectif ou individuel
	private String Type_Age;   // moins de 25 entre 25 et 45 plus de 45
	private String Nationalité; // pays
	private String Genre; // h ou f
	private String Couleur_Cheveux; // clair foncé
	private String Pilosité; // barbe imberbe 
	private String Cheveux; //chauve court long

	//Constructeurs

	public Personnage( String Type_de_sport, String Type_Age, String Nationalité, String Cheveux, String Sexe, String Couleur_Cheveux, String Pilosité ){
		this.Type_de_sport=Type_de_sport;
		this.Type_Age=Type_Age;
		this.Nationalité=Nationalité;
		this.Couleur_Cheveux=Couleur_Cheveux;
		this.Genre=Genre;
		this.Cheveux=Cheveux;
		this.Pilosité=Pilosité ;
	}
}

Personnage Mbappe = new Personnage ( "collectif" , )
