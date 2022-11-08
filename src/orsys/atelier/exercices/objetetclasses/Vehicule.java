package orsys.atelier.exercices.objetetclasses;

public abstract class Vehicule {
	
	private int x;
	
	private int y;
	
	abstract void avancer();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub		
		return this.getClass().getName() + " " + this.x + " " + this.y;
	}
	
}
