package orsys.atelier.exercices.stream;

public class Films {
	
	private String titre;
	
	private String realisateur;
	
	private String genre;
	
	private int anneeSortie;	

	public Films(String titre, String realisateur, String genre, int anneeSortie) {
		super();
		this.titre = titre;
		this.realisateur = realisateur;
		this.genre = genre;
		this.anneeSortie = anneeSortie;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getAnneeSortie() {
		return anneeSortie;
	}

	public void setAnneeSortie(int anneeSortie) {
		this.anneeSortie = anneeSortie;
	}	
	
}
