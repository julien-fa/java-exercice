package orsys.atelier.exercices.interfaces;

public class Requin implements Nageant {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getClass().getSimpleName();
	}
	
	@Override
	public void nager() {
		System.out.println("Le requin est en train de nager.");
	};
	
}
