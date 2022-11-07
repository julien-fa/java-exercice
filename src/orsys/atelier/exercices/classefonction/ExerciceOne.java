package orsys.atelier.exercices.classefonction;

import java.util.ArrayList;

public class ExerciceOne {

	public static void main(String[] args) {
		// TODO method and class
		ArrayList<String> prenoms = new ArrayList<>();
		prenoms.add("Marc");
		prenoms.add("Vivien");
		prenoms.add("Fred");
		prenoms.add("Gregoire");
		prenoms.add("Boris");
		
		for (String prenom : prenoms) {
			System.out.println(prenom.toUpperCase());			
		}
	}

}
