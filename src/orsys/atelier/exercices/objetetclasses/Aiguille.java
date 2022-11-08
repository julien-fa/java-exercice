package orsys.atelier.exercices.objetetclasses;

public class Aiguille {
	
	private int positionAiguille;
	
	private int maxi;	
	
	
	public Aiguille(int positionAiguille, int maxi) {		
		this.maxi = maxi;
		this.setPositionAiguille(positionAiguille);		
	}

	public void avancer() {
		if(positionAiguille > maxi) {
			this.positionAiguille = 0;
		}
		this.positionAiguille += 1;
	}
	

	public int getPositionAiguille() {
		return positionAiguille;
	}

	public void setPositionAiguille(int positionAiguille) {
		if(positionAiguille > this.maxi || positionAiguille < 0) {
			this.positionAiguille = 0;
		}
		else {
			this.positionAiguille = positionAiguille;
		}		
	}

	public int getMaxi() {
		return maxi;
	}

	public void setMaxi(int maxi) {
		this.maxi = maxi;
	}
	
}
