package orsys.atelier.exercices.serialisation;

import java.io.Serializable;

public class Chaussure implements Serializable {
	
	/**
	 * UID
	 */
	private static final long serialVersionUID = 3143658933335014846L;
	
	private String modele;
	
	private String marque;
	
	private double prix;	

	public Chaussure(String modele, String marque, double prix) {
		super();
		this.modele = modele;
		this.marque = marque;
		this.prix = prix;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}	
	
}
