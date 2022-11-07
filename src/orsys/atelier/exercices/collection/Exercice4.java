package orsys.atelier.exercices.collection;

import java.util.HashSet;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> couleur1 = new HashSet<String>();
		couleur1.add("rouge");
		couleur1.add("vert");
		couleur1.add("bleu");
		
		HashSet<String> couleur2 = new HashSet<String>();
		couleur2.add("rouge");
		couleur2.add("jaune");
		couleur1.addAll(couleur2);
		System.out.println(couleur1.toString());
	}

}
