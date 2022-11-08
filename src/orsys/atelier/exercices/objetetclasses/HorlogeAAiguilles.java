package orsys.atelier.exercices.objetetclasses;

public class HorlogeAAiguilles {
	
	private Aiguille aiguilleHeure;
	
	private Aiguille aiguilleMinutes;
	
	private Aiguille aiguilleSecondes;	
	
	public HorlogeAAiguilles(int h, int m, int s) {		
		this.aiguilleHeure = new Aiguille(h, 23);
		this.aiguilleMinutes = new Aiguille(m, 59);
		this.aiguilleSecondes = new Aiguille(s, 59);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return aiguilleHeure.getPositionAiguille() + ":" + aiguilleMinutes.getPositionAiguille() + ":" + aiguilleSecondes.getPositionAiguille();
	}

	public Aiguille getAiguilleHeure() {
		return aiguilleHeure;
	}

	public void setAiguilleHeure(Aiguille aiguilleHeure) {
		this.aiguilleHeure = aiguilleHeure;
	}

	public Aiguille getAiguilleMinutes() {
		return aiguilleMinutes;
	}

	public void setAiguilleMinutes(Aiguille aiguilleMinutes) {
		this.aiguilleMinutes = aiguilleMinutes;
	}

	public Aiguille getAiguilleSecondes() {
		return aiguilleSecondes;
	}

	public void setAiguilleSecondes(Aiguille aiguilleSecondes) {
		this.aiguilleSecondes = aiguilleSecondes;
	}
	
	public void avancerUneSeconde() {
		if(this.aiguilleSecondes.getPositionAiguille() == 59) {
			this.aiguilleMinutes.avancer();
			this.aiguilleSecondes.setPositionAiguille(0);
			
			if(this.aiguilleMinutes.getPositionAiguille() > 59) {
				this.aiguilleMinutes.setPositionAiguille(0);
				this.aiguilleHeure.avancer();
			}
			
			if(this.aiguilleHeure.getPositionAiguille() > 23) {
				this.aiguilleHeure.setPositionAiguille(0);
			}
		}
		else {
			this.aiguilleSecondes.avancer();
		}
	}
}
