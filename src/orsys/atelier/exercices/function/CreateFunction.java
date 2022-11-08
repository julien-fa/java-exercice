package orsys.atelier.exercices.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateFunction {

	public static void main(String[] args) {
		// TODO test code
		List<Integer> myList = new ArrayList<>();
		myList.add(3);
		myList.add(5);
		myList.add(9);
		
//		String[] test = {"test", "test"};
//		
//		metEnMajuscules(test);
		
		System.out.println(CreateFunction.recurPuissance(4,2));
		
	}	
	
	// TODO functions exercise one
	public static double puissance(double number, int puissance) {
		//double result = Math.pow(number, puissance);
		double result = 1;
		
		for(int i = 0; i < puissance;  i++) {
			result = number * result;
		}
		return result;
	}
	
	// TODO functions exercise two
	public static void carre(double number) {
		System.out.println(puissance(number, 2));
	}
	
	// TODO functions exercise three
	public static int factorielle(int number) {		
		int result = 1;
		for(int i = 2; i <= number;  i++) {
			result = result * i;
		}		
		return result;
	}
	
	// TODO functions exercise four	
		public static String majuscules(String... words ) {
			String result = "";
			for (String word : words) {
				result += " " + word.toUpperCase();
			}
			return result;
		}
		
		// TODO functions exercise five
		public static void metEnMajuscules(String[] arr) {
			for (int i = 0; i < arr.length; i++) {
				arr[i]= arr[i].toUpperCase();
			}			
			System.out.println(Arrays.toString(arr));
		}
		
		// TODO functions exercise six
		public static void displayCarreInList(List<Integer> listInt) {
			listInt.forEach((number) -> {
				int result = number * number;
				System.out.println(result);
			});			
		}
		
		// TODO functions exercise seven
		
		public static int recurFactorielle(int number) {
			int result = 1;
			if(number == 1) {
				return result;
			}
			result = number * recurFactorielle(number-1);			
			return result;
		}
		
		public static double recurPuissance(double number, int puissance) {
			double result = 1;
			if(puissance == 0) {
				return result;
			}
			puissance -= 1; 
			result = number * recurPuissance(number, puissance);
			return result;
		}
}
