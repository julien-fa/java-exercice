package orsys.atelier.exercices.objetetclasses;

public class Mirage extends Avion {
	
	@Override
	public void avancer() {
		super.avancer();
		this.x += 100;
	}

}
