package orsys.atelier.exercices.interfaces;

public class Crocodile implements Nageant, Marchant {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getClass().getSimpleName();
	}
	
	@Override
	public void nager() {
		System.out.println("Le crocodile est en train de nager.");
	};
	
	@Override
	public void marcher() {
		System.out.println("Le crocodile marche.");
	}
}
