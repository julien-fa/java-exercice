package orsys.atelier.exercices.classefonction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExerciceThree {

	public static void main(String[] args) {
		// TODO exercise 4 for java function
		Scanner scan = new Scanner(System.in);

		System.out.println("Rentrez différents mots séparés par un - : exemple : mot - mot - mot ");
		String phrase = scan.nextLine();
		ArrayList<String> list = new ArrayList<>(Arrays.asList(phrase.split("-")));
		System.out.println(list);
		for (String elt : list) {
			if(!(elt.contains("le")|| elt.contains("la"))) {
				System.out.println(elt);
			}
		}
		scan.close();
	}

}
