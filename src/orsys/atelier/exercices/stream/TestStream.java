package orsys.atelier.exercices.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {
		
		//exo one
		
		List<Integer> numbers = new ArrayList<>();
		
		for(int i = 1; i <= 1000; i++) {
			numbers.add(i);
		}
		Set<Integer> test = numbers.stream().filter(nombre -> nombre%2 == 0).collect(Collectors.toSet());		
		
		//exo two
		List<Integer> test2 = numbers.stream().filter(nombre -> nombre%3 == 0).collect(Collectors.toList());
		System.out.println(test2);
		
		//exo three
		List<Integer> test3 = numbers.stream().collect(Collectors.toList());
		Collections.reverse(test3);		
		System.out.println(test3);
		
		
	}

}
