package orsys.atelier.exercices.exception;

public class Service {
	
	public void transfer(int idCompteSource, int idCompteDest, double montant) throws MontantInvalideException {
		
		if(idCompteSource == 12345678) {
			if(montant > 0) {
				System.out.println("montant valide");
				System.out.println("test ok");
			}
			else {
				throw new MontantInvalideException("Le montant est inférieur à zéro");
			}
		}
		else {
			System.out.println("Compte invalide");
		}
		
	}
	
	public void retrait(int idCompte, double montant)throws MontantInvalideException, MontantTropEleveException{
		if(idCompte == 12345678) {
			if(montant > 0) {
				if(montant < 1000) {
					System.out.println("montant valide");
					System.out.println("test ok");
				}
				else {
					throw new MontantTropEleveException("Le montant du retrait est trop élevé");
				}
			}
			else {
				throw new MontantInvalideException("Le montant du retrait est inférieur à zéro");
			}
		}
		else {
			System.out.println("Compte invalide");
		}
	}
	
}
