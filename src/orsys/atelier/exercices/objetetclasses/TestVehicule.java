package orsys.atelier.exercices.objetetclasses;

import java.util.ArrayList;
import java.util.List;

public class TestVehicule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twingo renault = new Twingo();
		Ferrari redCar = new Ferrari();
		Twingo twing = new Twingo();
		Mirage mir = new Mirage();
		
		List<Vehicule> list = new ArrayList<>();
		list.add(redCar);
		list.add(renault);
		list.add(twing);
		list.add(mir);
		
		list.forEach((vehicule) -> {			
			vehicule.avancer();
			System.out.println(vehicule.toString());
		});
		
	}

}
