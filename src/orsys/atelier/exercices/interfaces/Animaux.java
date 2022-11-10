package orsys.atelier.exercices.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Animaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autruche autruche = new Autruche();
		Requin requin = new Requin();
		Crocodile croco = new Crocodile();
		Canard canard = new Canard();
		Elephant elephant = new Elephant();
		
		List<Object> animaux = new ArrayList<>();
		animaux.add(requin);
		animaux.add(croco);
		animaux.add(canard);
		animaux.add(autruche);
		animaux.add(elephant);
		
		for (Object animal : animaux) {
			//System.out.println(animal.toString());			
			if(animal instanceof Marchant && animal instanceof Volant) {
				((Marchant) animal).marcher();
				((Volant) animal).voler();
			}
			else if(animal instanceof Marchant) {
				((Marchant) animal).marcher();				
			}
			else if(animal instanceof Volant) {
				((Volant) animal).voler();				
			}
			else if(animal instanceof Nageant) {
				((Nageant) animal).nager();
			}
			else {
				System.out.println("On a rien à afficher.");
			}
		}
		

	}

}
