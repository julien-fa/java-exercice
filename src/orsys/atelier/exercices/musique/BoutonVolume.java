package orsys.atelier.exercices.musique;

public class BoutonVolume {
	
	private final int VOL_MAX = 1000;
	private int volume = 500;		

	public int getVolume() {
		return this.volume;
	}	

	public void addVolumePlus() {
		if(this.getVolume() >= VOL_MAX) {
			this.volume = VOL_MAX;
		}
		else {
			this.volume += 100;
		}		
	}
	
	public void downVolumeMoins() {
		if(this.getVolume() <= 100) {
			this.volume = 100;
		}
		else {
			this.volume -= 100;
		}		
	}
}
