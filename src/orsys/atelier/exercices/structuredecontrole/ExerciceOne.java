package orsys.atelier.exercices.structuredecontrole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciceOne {

	public static void main(String[] args) {
		// TODO exercise 1
		int a = 2;
		int b = 3;
		
		if(a>b) {
			System.out.println(a);
		}
		else if(a== b) {
			System.out.println(a +" est égal à " + b);
		}
		else {
			System.out.println(b);
		}
		//exercise 2
		
	    ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);
		numbers.add(10);
		
		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		// exercise 3
		int base = 2;
		int exponent = 16;
		int result = 1;
		for(int i = 0; i < exponent;  i++) {
			result = base * result;
		}
		System.out.println(result);
	}

}
