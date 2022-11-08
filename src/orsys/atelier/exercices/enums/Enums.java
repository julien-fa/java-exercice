package orsys.atelier.exercices.enums;

public class Enums {
	enum EtatCivil{
		CILIBATAIRE,
		MARIE,
		DIVORCE,
	}
	private String nom;
	
	public static void main(String[] args) {
		EtatCivil etatCivil = EtatCivil.CILIBATAIRE;
		
		System.out.println(etatCivil.toString());
		
		EtatCivil etat = EtatCivil.valueOf("CELIBATAIRE");
	}
	
}
