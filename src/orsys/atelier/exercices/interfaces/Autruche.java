package orsys.atelier.exercices.interfaces;

public class Autruche implements Marchant, Volant, Nageant {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getClass().getSimpleName();
	}
	
	@Override
	public void marcher() {
		System.out.println("L'autruche marche");
	};
	
	@Override
	public void nager() {
		System.out.println("L'autruche est en train de nager.");
	};
	
	@Override
	public void voler() {
		System.out.println("L'autruche vole");
	};
}
