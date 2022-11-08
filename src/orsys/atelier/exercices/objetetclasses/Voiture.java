package orsys.atelier.exercices.objetetclasses;

public class Voiture extends Vehicule {
	
	private int x;	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void avancer() {
		this.x += 5;		
	}
}
