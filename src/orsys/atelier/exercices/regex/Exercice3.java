package orsys.atelier.exercices.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercice3 {	

	public static void main(String[] args) {
		// TODO for the valid address
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir votre adresse ?");
		String address = scan.nextLine();		
		
		Pattern pat = Pattern.compile("^([0-9]*)[ ]+([a-zA-Z ]*)[, ]+([0-9]*)[ ]+([a-zA-Z ]*)$");			
		Matcher matcher = pat.matcher(address);		
		
		matcher.find();
		String num = matcher.group(1);
		String street = matcher.group(2);
		String zip = matcher.group(3);
		String town = matcher.group(4);
		
		boolean testMatch = matcher.matches();
		
		if(testMatch) {
			System.out.println(num);
			System.out.println(street);
			System.out.println(zip);
			System.out.println(town);
		}
		else {
			System.out.println("L'adresse n'est pas valide");
		}	
		
		scan.close();
		
	}	

}