package exercice3H;

	public class Secretaire extends Personne{

	    private String numeroBureau;

	//Constructor
	    public Secretaire(String nom, String prenom, int dateDeNaissance, String adresse, String ville, String numeroBureau) {
	        super(nom, prenom, dateDeNaissance, adresse, ville);
	        this.numeroBureau=numeroBureau;
	    }


	    @Override
	    public String toString() {
	        return super.toString() + '\'' + "Secretaire{" +
	                "Num de Bureau='" + numeroBureau + '\'' +
	                '}';
	    }
}
