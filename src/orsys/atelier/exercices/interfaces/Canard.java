package orsys.atelier.exercices.interfaces;

public class Canard implements Marchant, Nageant, Volant {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getClass().getSimpleName();
	}
	
	@Override
	public void marcher() {
		System.out.println("Le canard marche.");
	}
	
	@Override
	public void nager() {
		System.out.println("Le canard est en train de nager.");
	}
	
	@Override
	public void voler() {
		System.out.println("Le canard est en train de voler.");
	}
	
}
