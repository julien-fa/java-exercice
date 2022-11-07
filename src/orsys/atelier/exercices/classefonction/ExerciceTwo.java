package orsys.atelier.exercices.classefonction;

import java.util.Scanner;

public class ExerciceTwo {

	public static void main(String[] args) {
		// TODO exercise 3 function
		Scanner scan = new Scanner(System.in);

		System.out.println("Rentrez différents noms de pays au format : Pays, Pays, Pays : ");
		scan.useDelimiter(",");
		
		while(scan.hasNext()) {
			String country = scan.next().toLowerCase();
			System.out.println(country);
		}	
		scan.close();
		
	}

}
