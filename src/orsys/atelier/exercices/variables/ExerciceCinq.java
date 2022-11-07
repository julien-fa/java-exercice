package orsys.atelier.exercices.variables;

import java.util.Scanner;

public class ExerciceCinq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Vous devez rentrer un entier ?");
		int nombre = scan.nextInt();
		
		boolean pair = nombre % 2 == 0;
		
		if(pair) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		scan.close();
		
	}

}
