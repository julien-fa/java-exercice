package orsys.atelier.exercices.objetetclasses;

public class Mirage extends Vehicule {

	private int x;

	private int y;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub		
		return this.getClass().getName() + " " + this.x + " " + this.y;
	}

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
		this.x += 200;
		this.y += 10;
	}

}
