package orsys.atelier.exercices.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//

public class Exercice2 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vous devez saisir votre prénom ?");
		String prenom = scan.nextLine();		
		
		Pattern pat = Pattern.compile("^([A-Z]{1}[A-Za-z]*)?[- ]?([A-Z]{1}[a-z]*)$");			
		Matcher matcher = pat.matcher(prenom);		
		boolean testMatch = matcher.matches();
		
		if(testMatch) {
			System.out.println("Le prénom est valide");
		}
		else {
			System.out.println("Le prénom est non valide");
		}	
		
		scan.close();
	}

}
