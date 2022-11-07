package orsys.atelier.exercices.tableau;

import java.util.Arrays;

public class ExerciceQuatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNumbers = {10, 20, 30};
		int[] arrNumbers2 = {40, 50};
		
		int lenArrays = arrNumbers.length + arrNumbers2.length;
		
		int[] newArr = new int[lenArrays];
		
		//avec les boucles
		
		for(int i = 0; i < arrNumbers.length; i++) {
			newArr[i] = arrNumbers[i];
		}
		int count = 0;
		for(int i = arrNumbers.length; i < 5; i++) {
			newArr[i] = arrNumbers2[count];
			count++;
		}
		System.out.println(Arrays.toString(newArr));		
	}

}
