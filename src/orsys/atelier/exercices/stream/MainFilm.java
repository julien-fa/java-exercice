package orsys.atelier.exercices.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainFilm {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Films film1 = new Films("Batman", "Smith", "héro", 2003);
		Films film2 = new Films("Superman", "John", "enfant", 2015);
		Films film3 = new Films("Flash", "Marcus", "enfant", 2018);
		Films film4 = new Films("Joker", "Andersson", "drame", 2019);
		Films film6 = new Films("Juan", "Andersson", "horreur", 2019);
		Films film7 = new Films("Horror storie", "Tarantino", "policier", 2019);
		Films film8 = new Films("Police", "Tarantino", "policier", 2019);
		Films film9 = new Films("New ham", "Tarantino", "policier", 2019);
		Films film10 = new Films("Film6", "Tarantino", "drame", 2019);
		Films film5 = new Films("X-men", "Andre", "hero", 2007);
		
		List<Films> manyFilm = new ArrayList<>();
		manyFilm.add(film1);
		manyFilm.add(film2);
		manyFilm.add(film3);
		manyFilm.add(film4);
		manyFilm.add(film5);
		manyFilm.add(film6);
		manyFilm.add(film7);
		manyFilm.add(film8);
		manyFilm.add(film9);
		manyFilm.add(film10);
		
		
		//2.1
		
		List<Films> test1 = manyFilm.stream().filter(film -> film.getGenre() == "enfant").collect(Collectors.toList());
//		for (Films films : test1) {
//			System.out.println(films.getTitre());
//		}
		
		//2.2
		
		List<Films> test2 = manyFilm.stream()
				.filter(film -> film.getGenre() == "horreur")
				.sorted(Comparator.comparing(Films::getTitre))
				.collect(Collectors.toList());
				
//		for (Films films : test2) {
//			System.out.println(films.getTitre() + " " + films.getGenre());
//		}
		
		//2.3
		
		List<Films> test3 = manyFilm.stream()
				.filter(film -> film.getGenre() == "policier" && film.getRealisateur() == "Tarantino")
				.sorted(Comparator.comparing(Films::getTitre))				
				.collect(Collectors.toList());
				
//		for (Films films : test3) {
//			System.out.println(films.getTitre() + " " + films.getGenre()+ " " + films.getRealisateur());
//		}
		
		//2.4 
		List<Films> test4 = manyFilm.stream()
				.filter(film -> film.getGenre() == "policier" && film.getRealisateur() == "Tarantino")
				.sorted(Comparator.comparing(Films::getTitre))				
				.collect(Collectors.toList());
		
		List<String> strFinal = test4.stream().map(film -> film.getTitre()).collect(Collectors.toList());
		
				
		for (String title : strFinal) {
			System.out.println(title);
		}
		
		
	}

}
