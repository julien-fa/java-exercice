package orsys.atelier.exercices.midi;

import javax.sound.midi.MidiUnavailableException;

public class Clavier {
	
	private Synthe synthe;
	private String noteAppuyee = null;
	
	public Clavier(Synthe synthe) {
		this.synthe = synthe;
	}
	
	public void appuyerTouche(String note) throws MidiUnavailableException {
		this.synthe.jouerNote(note);
	}	
	
}
