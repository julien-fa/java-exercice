package orsys.atelier.exercices.exception;

public class GestionErreur {
	
	public static void main(String[] args) {
		
		Service serv = new Service();
		
		try {
			
			serv.transfer(12345678, 5858, 100);
			serv.retrait(12345678, 1100);
			
		} catch (MontantInvalideException | MontantTropEleveException e) {			
			System.out.println(e.getMessage());			
		}		
	}
}
