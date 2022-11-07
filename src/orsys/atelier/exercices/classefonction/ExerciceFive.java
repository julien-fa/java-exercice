package orsys.atelier.exercices.classefonction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExerciceFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			System.out.println(String.format("Le numéro : %s , la rue : %s, le code postal : %s, la ville : %s", num, street, zip, town));
		}
		else {
			System.out.println("L'adresse n'est pas valide");
		}	
		
		scan.close();
	}

}
