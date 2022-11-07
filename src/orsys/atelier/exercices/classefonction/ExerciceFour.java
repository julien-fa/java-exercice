package orsys.atelier.exercices.classefonction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExerciceFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Rentrez différents nombres entiers séparés par une virgule : exemple : 1, 2, 3");
		String phrase = scan.nextLine();
		ArrayList<String> list = new ArrayList<>(Arrays.asList(phrase.split(",")));
		System.out.println(list);
		for (String elt : list) {
			double number = (double)Integer.parseInt(elt);			
			System.out.println(Math.cos(number));
		}
		
		scan.close();
	}

}
