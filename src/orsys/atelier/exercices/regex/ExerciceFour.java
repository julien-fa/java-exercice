package orsys.atelier.exercices.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExerciceFour {

	public static void main(String[] args) {
		// TODO exercise four 
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez entrer votre :  Prénom Nom, Age ?");
		String informations = scan.nextLine();
		
		//define the pattern with method find
		
		Pattern pat = Pattern.compile("([A-Z]{1}[a-z]*|[A-Z]{1}[a-z]*[-][A-Z]{1}[a-z]*)[ ]([A-Z]{1}[A-Za-z]*)[, ]([ 0-9]{1,3})");
		Matcher matcher = pat.matcher(informations);
		
		matcher.find();
		String prenom = matcher.group(1);
		String nom = matcher.group(2);
		String age = matcher.group(3);
		
		boolean testMatch = matcher.matches();
		
		if(testMatch) {
			String identitePrenom = String.format("Prénom= %s", prenom);
			System.out.println(identitePrenom);
			scan.nextLine();
			String identiteNom = String.format("Nom= %s", nom);
			System.out.println(identiteNom);
			scan.nextLine();
			String identiteAge = String.format("Age= %s", age);
			System.out.println(identiteAge);			
		}
		else {
			System.out.println("Les informations ne sont pas valides");
		}	

		scan.close();

	}

}
