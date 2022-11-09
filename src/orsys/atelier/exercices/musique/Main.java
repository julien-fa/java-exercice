package orsys.atelier.exercices.musique;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Synthetiseur synthe = new Synthetiseur();		
		synthe.clicBoutonOnOff();
		
		synthe.getClavier().presseTouche("LA");
		synthe.volumePlus();
		synthe.getClavier().presseTouche("LA");
		synthe.volumePlus();
		synthe.getClavier().presseTouche("LA");
		synthe.volumePlus();		
		synthe.volumeMoins();
		
		synthe.clicBoutonOnOff();
		
	}

}
