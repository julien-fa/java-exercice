package orsys.atelier.exercices.objetetclasses;

public abstract class Vehicule {
	
	protected int x;
	
	protected int y;
	
	abstract void avancer();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub		
		return this.getClass().getSimpleName() + " " + this.x + " " + this.y;
	}
	
}
