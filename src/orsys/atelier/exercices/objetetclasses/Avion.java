package orsys.atelier.exercices.objetetclasses;

public class Avion extends Vehicule {
	
	private int x;
	
	private int y;	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void avancer() {
		this.x += 100;
		this.y += 10;
	}
}
