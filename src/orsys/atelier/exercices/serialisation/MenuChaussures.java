package orsys.atelier.exercices.serialisation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuChaussures {
	
	//private List<Chaussure> test = new ArrayList<>();

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		boolean noStop = true;
		Scanner scan = new Scanner(System.in);
		
		while (noStop) {
			System.out.println("Bienvenue dans le menu chaussure !");
			
			System.out.println("Que voulez vous faire ?");
			
			System.out.println("Ajouter une chaussure, taper un");
			System.out.println("Afficher la liste des modèles existants, taper deux ?");
			System.out.println("Afficher la liste des modèles d'une marque, taper trois ?");
			System.out.println("Supprimer un modèle de chaussure, taper quatre ?");
			System.out.println("Quitter : taper 5 ?");
			
			System.out.println("Votre choix : ");
			
			int number = scan.nextInt();
			
			if(number == 1) {
				MenuChaussures.ajouterChaussure();
			}
			else if(number == 2) {
				MenuChaussures.listerChaussures();
			}
			else if(number == 3) {
				MenuChaussures.listerMarques();
			}
			else if(number == 4) {
				MenuChaussures.supprimerChaussure();
			}
			else if(number == 5) {
				noStop = false;
				break;
			}
			else {
				System.out.println("Le nombre est invalide.");
			}			
		}		
		scan.close();
	}
	
	public static void ajouterChaussure() throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quel est le modèle pour les chaussures ?");
		String model = scan.nextLine();
		
		System.out.println("Quelle est la marque?");
		String marque = scan.nextLine();
			
		System.out.println("Quelle est le prix?");
		double prix = scan.nextDouble();		
		
		scan.close();	
		
		//search
		boolean findFile = false;
		
		try {
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File("chaussures.bin")));			
			findFile = true;
			System.out.println(true);
		} catch (Exception e) {
			findFile = false;
			System.out.println(false);
		}
		
		//test app
		
		if(findFile) {
			Chaussure newChaussure = new Chaussure(model, marque, prix);
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File("chaussures.bin")));
			List<Chaussure> listChaussures = (List<Chaussure>) stream.readObject();
			listChaussures.add(newChaussure);
			
			ObjectOutputStream stream2 = new ObjectOutputStream(new FileOutputStream(new File("chaussures.bin")));
			
			stream2.writeObject(listChaussures);
			stream2.flush();
			stream2.close();	
			stream.close();
		}
		else {
			Chaussure newChaussure = new Chaussure(model, marque, prix);
			List<Chaussure> listeChaussures = new ArrayList<>();
			listeChaussures.add(newChaussure);
			
			ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(new File("chaussures.bin")));
			
			stream.writeObject(listeChaussures);
			stream.flush();
			stream.close();	
		}
		System.out.println("Les chaussures ont été ajoutées.");
				
	}
	
	public static void listerChaussures() throws FileNotFoundException, IOException, ClassNotFoundException {
		try {			
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File("chaussures.bin")));						
			
		} catch (Exception e) {
			System.out.println("Aucune chaussure n'est enregistrée !");
		}
		
		ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File("chaussures.bin")));
		List<Chaussure> listChaussures = (List<Chaussure>) stream.readObject();
		System.out.println("Voici la liste : ");		
		
		for (Chaussure element : listChaussures) {
			System.out.println(element.getModele());	
		}
	}
	
	public static void listerMarques() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		try {			
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File("chaussures.bin")));			
		} catch (Exception e) {
			System.out.println("Aucune chaussure n'est enregistrée !");
		}
		
		ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File("chaussures.bin")));
		List<Chaussure> listChaussures = (List<Chaussure>) stream.readObject();		
		System.out.println("La liste de quelle marque ?");
		for (Chaussure element : listChaussures) {				
			System.out.println("Marque : " + element.getMarque());	
		}
		System.out.println("Rentrer le nom de la marque : ");
		Scanner scan = new Scanner(System.in);
		String marque = scan.nextLine();
		
		//on liste
		
		System.out.println("Voici la liste des chaussures : ");
		for (Chaussure element : listChaussures) {
			if(element.getMarque().equals(marque)) {						
				System.out.println("La marque " + element.getMarque() + ", le modèle : "  + element.getModele() + ", et le prix : " + element.getPrix());	
			}			
		}
		
	}
	
	public static void supprimerChaussure() throws FileNotFoundException, IOException, ClassNotFoundException {
		try {			
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File("chaussures.bin")));						
			
		} catch (Exception e) {
			System.out.println("Aucune chaussure n'est enregistrée !");
		}
		
		System.out.println("Rentrer le nom du modèle que vous voulez supprimer : ");
		Scanner scan = new Scanner(System.in);
		String modele = scan.nextLine();
		
		//on récupère la liste
		
		ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File("chaussures.bin")));
		List<Chaussure> listChaussures = (List<Chaussure>) stream.readObject();	
		int count = 0;
		
		for (Chaussure element : listChaussures) {
			if(element.getModele().equals(modele)) {				
				listChaussures.remove(count);				
				ObjectOutputStream stream2 = new ObjectOutputStream(new FileOutputStream(new File("chaussures.bin")));				
				stream2.writeObject(listChaussures);
				stream2.flush();
				stream2.close();	
				System.out.println("Chaussure supprimée");
				break;
			}			
			count++;			
		}
		stream.close();		
		
	}

}
