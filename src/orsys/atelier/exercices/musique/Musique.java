package orsys.atelier.exercices.musique;

import javax.sound.midi.Synthesizer;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;

public class Musique {

	public static void exempleCours() throws MidiUnavailableException, InterruptedException {
		// TODO Auto-generated method stub
		//String song = "DO RE MI DO DO RE MI DO MI FA SOL MI MI FA SOL MI";
		String morceau = "DO RE MI FA SOL";
		
		Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        Instrument[] instruments = synth.getDefaultSoundbank().getInstruments();
        synth.loadInstrument(instruments[100]);
        channels[0].noteOn(60, 600);
        Thread.sleep(500);
        channels[0].noteOn(65, 600);
        Thread.sleep(500);
        channels[0].noteOn(69, 600);
        Thread.sleep(500);
	}

	//Synthesizer synth = MidiSystem.getSynthesizer();
	//synth.open();
	//MidiChannel[] channels = synth.getChannels();
	//Instrument[] instruments = synth.getDefaultSoundbank().getInstruments();
	//synth.loadInstrument(instruments[100]);
	//
	//channels[0].noteOn(60, 600);
	//Thread.sleep(500);
	//channels[0].allNotesOff();
	//
	//channels[0].noteOn(62, 600);
	//Thread.sleep(500);
	//channels[0].allNotesOff();
	//
	//channels[0].noteOn(64, 600);
	//Thread.sleep(500);
	//channels[0].allNotesOff();
}


