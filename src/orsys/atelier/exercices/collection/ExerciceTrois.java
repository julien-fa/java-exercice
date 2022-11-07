package orsys.atelier.exercices.collection;

import java.util.ArrayList;

public class ExerciceTrois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> couleur1 = new ArrayList<>();
		couleur1.add("rouge");
		couleur1.add("vert");
		couleur1.add("bleu");
		
		ArrayList<String> couleur2 = new ArrayList<>();
		couleur2.add("rouge");
		couleur2.add("jaune");
		couleur1.addAll(couleur2);
		System.out.println(couleur1.toString());		
	}

}
