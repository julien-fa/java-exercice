package orsys.atelier.exercices.objetetclasses;

public class Ferrari extends Voiture{
	
	private int x;
	
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void avancer() {
		this.x += 50;		
	}
	
	public static void main(String[] args) {
		Ferrari carRed = new Ferrari();
		carRed.avancer();
		carRed.avancer();
		System.out.println(carRed.x);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub		
		return this.getClass().getName() + " " + this.x + " " + this.y;
	}
}
