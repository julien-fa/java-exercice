package orsys.atelier.exercices.objetetclasses;

public class Boeing extends Avion {	
	
	@Override
	public void avancer() {
		super.avancer();
		this.y += 5;
	}
}
