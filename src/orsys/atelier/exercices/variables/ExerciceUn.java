package orsys.atelier.exercices.variables;

public class ExerciceUn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String verre1 = "liquide vert";
		String verre2 = "liquide rouge";
		String contenu = verre1;
		
		//on inverse
		
		verre1 = verre2;
		verre2 = contenu;
		
		//
		System.out.println(verre1);
		System.out.println(verre2);		
	}

}
