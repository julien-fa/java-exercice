package orsys.atelier.exercices.variables;

import java.util.Scanner;

public class ExerciceDeux {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vous devez rentrer un nombre entier ?");
		String nombre = scan.nextLine();
		
		//method valueOf() too
		
		int num = Integer. parseInt(nombre);
		int result = num*2;
		
		System.out.println(result);		
		
		scan.close();
	}
}
