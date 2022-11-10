package orsys.atelier.exercices.musique;

import javax.sound.midi.Synthesizer;

import java.util.HashMap;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;

public class Musique {
	
	public static void main(String[] args) {
	    Musique.testMusique();
	}
	

	public static void exempleCours() throws MidiUnavailableException, InterruptedException {
		// TODO Auto-generated method stub
		//String song = "DO RE MI DO DO RE MI DO MI FA SOL MI MI FA SOL MI";
		//String otherSong = "DO RE MI FA SOL LA SI DO";
				
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
	
	public static void testJul() {
		
		int[] notes = {57, 60, 62, 64, 65, 67, 69, 71, 72, 72, 71, 69, 67, 65, 64, 62, 60, 57};
		
		        
        try {
        	
        	Synthesizer synth = MidiSystem.getSynthesizer();
        	//we start the synthesizer
            synth.open();
            MidiChannel[] channels = synth.getChannels();
            
            for (int note : notes) {
            	
            	try {
            		channels[0].noteOn(note, 900);
            		Thread.sleep(1000);
            	}
				catch(InterruptedException e) {
					break;
				}
            	finally {
            		channels[0].noteOff(note);
            	}
			}            
        	
        }catch(MidiUnavailableException e) {
        	e.printStackTrace();        	
        }
	}
	
public static void testMusique() {
	
		String[] songs = {"DO", "RE", "MI", "DO", "DO", "RE", "MI", "DO", "MI", "FA", "SOL", "MI", "MI", "FA", "SOL", "MI"};
		
		//int[] notes = {60, 62, 64, 65, 67, 69, 71, 72, 72, 71, 69, 67, 65, 64, 62, 60};
		
		HashMap<String, Integer> notes = new HashMap<String, Integer>();
		notes.put("DO", 60);
		notes.put("RE", 62);
		notes.put("MI", 64);
		notes.put("FA", 66);
		notes.put("SOL", 69);
		notes.put("LA", 71);
		notes.put("SI", 72);
				        
        try {
        	
        	Synthesizer synth = MidiSystem.getSynthesizer();
        	//we start the synthesizer
            synth.open();
            MidiChannel[] channels = synth.getChannels();
           
            for (String noteMusic : songs) {				
			
            	for (String key : notes.keySet()) {
            		if(noteMusic.equals(key)) {
            			try {
                			channels[0].noteOn(notes.get(key), 900);
                			Thread.sleep(1000);
                		}
                		catch(InterruptedException e) {
                			break;
                		}
                		finally {
                			channels[0].noteOff(notes.get(key));
                		}
            		}
            		else {
            			
            		}
            	}            
            }
        }catch(MidiUnavailableException e) {
        	e.printStackTrace();        	
        }
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


