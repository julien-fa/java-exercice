package orsys.atelier.exercices.objetetclasses;

public class Twingo extends Voiture {
	
	private int x;
	
	private int y;
	
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
	
	public void avancer() {
		this.x += 5;
	}
	
	public static void main(String[] args) {
		Twingo car = new Twingo();
		car.avancer();
		car.avancer();
		System.out.println(car.x);
	}
	
}
