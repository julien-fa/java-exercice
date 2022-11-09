package orsys.atelier.exercices.midi;

public class BoutonVolume {
	private int volume = 500;

	public int getVolume() {
		return this.volume;
	}

	public void addVolumePlus() {
		if (this.getVolume() == 1000) {
			this.volume = 1000;
		} else {
			this.volume += 100;
		}
	}

	public void downVolumeMoins() {
		this.volume -= 100;
	}
}
