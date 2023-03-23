package produit;

public abstract class Produit {
	protected String nom;
	protected Unite unite;
	protected double valeur;
	
	public Produit(String nom, Unite unite, double valeur) {
		this.nom = nom;
		this.unite = unite;
		this.valeur = valeur;
	}
	
	public abstract String getDescription();
	
	public String getNom() {
		return this.nom;
	}
}
