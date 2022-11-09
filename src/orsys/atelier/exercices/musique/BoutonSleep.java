package orsys.atelier.exercices.musique;

public class BoutonSleep {
	
	private int sleep = 1000;
	
	private final int ELT_MAX = 1000;

	public int getSleep() {
		return sleep;
	}

	public void addSleep() {
		if(this.getSleep() >= ELT_MAX) {
			this.sleep = ELT_MAX;
		}
		else {
			this.sleep += 100;
		}
	}

	public void downSleep() {
		if(this.getSleep() <= 100) {
			this.sleep = 100;
		}
		else {
			this.sleep -= 100;
		}		
	}
}
