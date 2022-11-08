package orsys.atelier.exercices.objetetclasses;

import java.util.ArrayList;
import java.util.List;

public class TestHorloges {

	public static void main(String[] args) {
				
		HorlogeAAiguilles temps = new HorlogeAAiguilles(23, 59, 59);
		HorlogeAAiguilles temps1 = new HorlogeAAiguilles(22, 59, 59);
		HorlogeAAiguilles temps2 = new HorlogeAAiguilles(14, 45, 2);
		HorlogeAAiguilles temps3 = new HorlogeAAiguilles(22, 30, 59);
		HorlogeAAiguilles temps4 = new HorlogeAAiguilles(16,59,59);
		
		List<HorlogeAAiguilles> listHeure = new ArrayList<>();
		listHeure.add(temps);
		listHeure.add(temps1);
		listHeure.add(temps2);
		listHeure.add(temps4);
				
		
		for (HorlogeAAiguilles horloge : listHeure) {			
			horloge.avancerUneSeconde();		
			System.out.println(horloge.toString());					
		}		
		
	}

}
