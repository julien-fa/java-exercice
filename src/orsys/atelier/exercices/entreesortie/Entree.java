package orsys.atelier.exercices.entreesortie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Entree {

	public static void main(String[] args) throws IOException {
		// TODO one
		File dossier = new File("C:\\gitTest");
		File[] fichiers = dossier.listFiles();
		
		for (File fichier : fichiers) {
//				if(fichier.isDirectory()) {
//					System.out.println("Nom du repertoire " + fichier);
//				}
				if(fichier.isFile()) {
					String name = fichier.getAbsolutePath();
					if(name.contains(".png")) {
						//System.out.println("Nom du fichier " + fichier);
					}					
				}
		}	
		
		// TODO two
		File dossiers = new File("C:\\gitTest\\chercher");
		
		//recursive
		Entree.search(dossiers, "or.txt");
			
	    // Get all files from a directory.	    
	    
	    
	    
//	    File[] dossiersListe = dossiers.listFiles();
//	    
//	   for(int i = 0; i < dossiersListe.length; i++) {
//		   	if(dossiersListe[i].isDirectory()) {
//		   		File[] listSousDossiers = dossiersListe[i].listFiles();
//		   		for(File element : listSousDossiers) {
//		   			if(element.isFile()) {
//		   				if(element.getName().equals("or.txt")) {
//			   				System.out.println("Le fichier a été trouvé");
//			   				System.out.println("Le fichier est : " + element);
//			   			}
//		   			}		   			
//			  }
//		    }
//	    }	    
	    	    
	   // TODO three
	   String cheminFichier = "C:\\gitTest\\java.txt" ;
	   
	   Stream<String> stream = new BufferedReader( new FileReader(cheminFichier) ).lines();
	   List<String> strings = stream.collect(Collectors.toList());
	   
	   //TODO four
	   File outFile = new File("C:\\gitTest\\rapport-error.txt");
	   BufferedWriter writer = new BufferedWriter( new FileWriter(outFile));
	   	   	   
	   for (String elt : strings) {
		   if(elt.contains("warning")) {
			   System.out.println(elt);
			   writer.write(elt + "\n"); 
		   }
	    }
	   writer.close();
	   
	   //TODO five
	   
	    
	}
	
	// function TODO two
		
			public static boolean search(File dossier, String nomFichier) {
				
				File[] fichiers = dossier.listFiles();
				
				for(File fichier : fichiers) {
					if(fichier.isFile()) {
		   				if(fichier.getName().equals(nomFichier)) {
			   				System.out.println("Le fichier a été trouvé");
			   				System.out.println("Le fichier est : " + fichier);
			   				return true;
			   			}
		   			}
					else if(fichier.isDirectory()) {						
						Entree.search(fichier, nomFichier);
					}
					else {
						Entree.search(fichier, nomFichier);
					}
				}				
				return false;
			} 
			
			
}
