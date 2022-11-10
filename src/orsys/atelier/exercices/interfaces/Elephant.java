package orsys.atelier.exercices.interfaces;

public class Elephant implements Nageant, Marchant {
	@Override
	public void nager() {
		System.out.println("L' éléphant est en train de nager.");
	};
	
	@Override
	public void marcher() {
		System.out.println("L' éléphant marche.");
	}
}
