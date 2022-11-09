package orsys.atelier.exercices.objetetclasses;

public class Ferrari extends Voiture{
			
	@Override
	public void avancer() {
		super.avancer();		
		x += 45;
	}	
	
}
