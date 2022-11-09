package orsys.atelier.exercices.musique;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class BoutonOnOff {
	
	protected static Synthesizer SYNTH;
	
	private boolean start = false;	
		
	
	public void startOrStop() {
		if (this.start == false) {
			try {	
				this.start = true;
				SYNTH = MidiSystem.getSynthesizer();
				SYNTH.open();				
				
			} catch(MidiUnavailableException e) {
	        	e.printStackTrace();        	
	        }		
		}
		else {
			this.start = false;		
			SYNTH.close();	
		}
	}

}
