package orsys.atelier.exercices.dateheure;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class ExerciceTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method Exercise three
		LocalDate testDate = LocalDate.now();
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/YYYY");			
		String frenchDate = testDate.format(formater);		
		
		DateTimeFormatter  americaFormattter = DateTimeFormatter.ofPattern("YYYY/MM/dd");
		frenchDate = testDate.format(americaFormattter);
		System.out.println(frenchDate);
		
		String customDate = "31/12/2030";
		//year always in lower case
		DateTimeFormatter formaterFr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter  americaFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		LocalDate dateF = LocalDate.parse(customDate, formaterFr);
		
		System.out.println(dateF.format(americaFormatter));
				
		//exercise four
		String passedDate = "27/02/2020";
		LocalDate datePasse = LocalDate.parse(passedDate, formaterFr);
		datePasse.plusDays(10);
		System.out.println(datePasse.plusDays(10));
		
		//other
		
//		String sDate1="27/02/2020";  
//		SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
//		Date date1=formatter1.parse(sDate1);
        
//        Calendar calandar = Calendar.getInstance();
//        calandar.setTime(today);
//        calandar.add(Calendar.DATE, 10);
//        today = calandar.getTime();
//        System.out.println("jour + 10 : " + date1);			
		
	}	
	

}
