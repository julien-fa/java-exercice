package orsys.atelier.exercices.objetetclasses;

public class Horloge {
	
	private int heures;
	
	private int minutes;
	
	private int secondes;
	
	public static void main(String[] args) {
		Horloge time = new Horloge(10, 30, 59);		
		time.avanceUneSeconde();
		System.out.println(time.toString());
	}	

	public Horloge() {		
	}	

	public Horloge(int heures, int minutes, int secondes) {		
		this.setHeures(heures);
		this.setMinutes(minutes);
		this.setSecondes(secondes);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.heures + ":" + this.minutes + ":" + this.secondes;
	}

	public int getHeures() {
		return heures;
	}
	
	public void setHeures(int heures) {
		if(heures > 23 || heures < 0) {
			this.heures = 0;
		}
		else {
			this.heures = heures;
		}		
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if(minutes > 59 || minutes < 0) {
			this.minutes = 0;			
		}
		else {
			this.minutes = minutes;
		}		
	}

	public int getSecondes() {
		return secondes;
	}

	public void setSecondes(int secondes) {
		if(secondes > 59 || secondes < 0) {
			this.secondes = 0;
		}
		else {
			this.secondes = secondes;
		}		
	}	
	
	public void avanceUneSeconde() {
		if(this.secondes == 59) {
			this.minutes += 1;
			this.secondes = 0;
			
			if(this.minutes > 59) {
				this.minutes = 0;
				this.heures += 1;
			}
			
			if(this.heures > 23) {
				this.heures = 0;
			}
		}
		else {
			this.secondes += 1;
		}
	}
		
}
