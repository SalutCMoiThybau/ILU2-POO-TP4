package produit;

public class Poisson extends Produit {
	private String datePeche;

	public Poisson(String nom, Unite unite, double valeur, String date) {
		super(nom, unite, valeur);
		this.datePeche = date;
	}

	@Override
	public String getDescription() {
		return  getNom() + " pêché " + datePeche + ".";
	}
}
