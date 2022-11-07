package orsys.atelier.exercices.collection;

import java.util.HashSet;

public class Exercice5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> tab1 = new HashSet<Integer>();
		tab1.add(1);
		tab1.add(2);
		tab1.add(3);
		tab1.add(4);
		tab1.add(5);
		
		
		HashSet<Integer> tab2 = new HashSet<Integer>();		
		tab2.add(2);
		tab2.add(3);
		tab2.add(4);
		
		
		tab1.removeAll(tab2);
		
		System.out.println(tab1);
		
	}
}
