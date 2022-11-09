package orsys.atelier.exercices.musique;

import java.util.HashMap;

public class Clavier {
	
	private Synthetiseur synthe;
		
	public Clavier(Synthetiseur synthe) {		
		this.synthe = synthe;
	}
	
	public void presseTouche(String note) {
		
		HashMap<String, Integer> notes = new HashMap<String, Integer>();
		notes.put("DO", 72);
		notes.put("RE", 62);
		notes.put("MI", 64);
		notes.put("FA", 66);
		notes.put("SOL", 69);
		notes.put("LA", 70);
		notes.put("SI", 71);
		
		int noteNumber = 0;
		
		for (String key : notes.keySet()) {			
			if(note.equals(key)) {
				noteNumber = notes.get(note);
			}			
		}		
		this.synthe.jouerPresserNote(noteNumber);
	}
}
