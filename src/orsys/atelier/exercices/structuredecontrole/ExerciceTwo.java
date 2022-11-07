package orsys.atelier.exercices.structuredecontrole;

import java.util.Scanner;

public class ExerciceTwo {

	public static void main(String[] args) {
		// TODO Exercise 4 factorial
//		int number = 8;
//		int result = 1;
//		for(int i = 2; i <= number;  i++) {
//			result = result * i;
//		}		
//		System.out.println(result);
		
		ExerciceTwo.findNumber();

	}

	public static void findNumber() {
		// use Math random

		int nombre = (int) Math.floor(Math.random() * (100 - 1 + 1)) + 1;
		int tentative = 1;
		Scanner scan = new Scanner(System.in);

		System.out.println("Vous devez trouver le nombre de l'ordinateur entre 1 et 100.");
		System.out.println("Choisissez un nombre entre 1 et 100 :");
		int choice = scan.nextInt();

		while (choice != nombre) {
			if(choice < nombre) {
				System.out.println("Choisissez un autre plus grand que : " + choice);
				choice = scan.nextInt();
				tentative++;
			}
			else {
				System.out.println("Choisissez un nombre plus petit que : " + choice);
				choice = scan.nextInt();
				tentative++;
			}			
		}
		System.out.println("Bravo, le nombre est " + choice);
		System.out.println("Vous avez fait " + tentative + " essais");
		scan.nextLine();
		
		System.out.println("Voulez-vous refaire une partie ? oui ou non ?");
		String answer = scan.nextLine();		
		
		
		if(answer.equals("oui")) {
			ExerciceTwo.findNumber();
		}		
		scan.close();
	}

}
