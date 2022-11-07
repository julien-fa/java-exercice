package orsys.atelier.exercices.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercice1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vous devez rentrez votre adresse mail ?");
		String email = scan.nextLine();
		
		
		// TODO Auto-generated method stub
		//  answer: ^[\\w\\.-]+@[\\w\\.-]+.[a-z,A-Z]+$
		
		Pattern pat = Pattern.compile("^[\\w\\.-]*[@][\\w-]*[\\.][\\w-]{2,3}$");
		Matcher matcher = pat.matcher(email);
		
		boolean testMatch = matcher.matches();
		
		if(testMatch) {
			System.out.println("L'adresse mail est valide");
		}
		else {
			System.out.println("L'adresse mail est non valide");
		}	
		
		scan.close();
	}

}
