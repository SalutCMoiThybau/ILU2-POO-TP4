package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	private int poids;
	private Gaulois chasseur;
	
	public Sanglier(String nom, Unite unite, double valeur, int poids, Gaulois chasseur) {
		super(nom, unite, valeur);
		this.poids = poids;
		this.chasseur = chasseur;
	}

	@Override
	public String getDescription() {
		return  getNom() + " de " + poids + unite + " chassé par " + chasseur + ".";
	}
}
