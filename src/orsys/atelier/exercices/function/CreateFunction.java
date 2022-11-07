package orsys.atelier.exercices.function;

public class CreateFunction {

	public static void main(String[] args) {
		// TODO functions exercise four	
		CreateFunction.majuscules("denver", "marc", "objet");
	}
	
	public static void majuscules(String... words ) {
		for (String word : words) {
			System.out.println(word.toUpperCase());
		}		
	}
	
	public static void puissance() {
	}
	
	public static void carre(String... words ) {
	}
	
	public static void factorielle(String... words ) {
	}
	

}
