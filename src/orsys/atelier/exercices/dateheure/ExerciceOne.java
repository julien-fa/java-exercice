package orsys.atelier.exercices.dateheure;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExerciceOne {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub exercise one
		DayOfWeek day = LocalDate.now().getDayOfWeek();
		System.out.println(day);
				
		//exercise 2
		LocalDate testDate = LocalDate.now();
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd / MM /YYYY");
		System.out.println(testDate.format(formater));		
		
	}

}
