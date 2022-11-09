package orsys.atelier.exercices.musique;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.Synthesizer;

public class Synthetiseur extends BoutonOnOff {

	private BoutonOnOff boutonOnOff = new BoutonOnOff();

	private BoutonVolume boutonVolume = new BoutonVolume();
	
	private BoutonSleep boutonSleep = new BoutonSleep();

	private Clavier clavier = new Clavier(Synthetiseur.this);

	public Clavier getClavier() {
		return clavier;
	}	

	public void clicBoutonOnOff() {
		boutonOnOff.startOrStop();
	}

	public void jouerPresserNote(int note) {		

		try {
			Synthesizer synth = BoutonOnOff.SYNTH;
			MidiChannel[] channels = synth.getChannels();	
		
				try {
					channels[0].noteOn(note, boutonVolume.getVolume());
					Thread.sleep(boutonSleep.getSleep());
					
				} catch (InterruptedException e) {
					e.printStackTrace();
					
				} finally {					
					this.relacherNote(channels, note);					
				}
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	public void relacherNote(MidiChannel[] channels, int note) {
		channels[0].noteOff(note);
	}

	public void volumePlus() {
		this.boutonVolume.addVolumePlus();
	}

	public void volumeMoins() {
		this.boutonVolume.downVolumeMoins();
	}
	
	public void tempsPlus() {
		this.boutonSleep.addSleep();
	}

	public void tempsMoins() {
		this.boutonSleep.downSleep();
	}

}
