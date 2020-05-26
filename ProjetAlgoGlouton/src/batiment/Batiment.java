package batiment;

public class Batiment {
	private int longueur;
	private int largeur;
	private int numero;
	
	public Batiment(int longueur, int largeur, int numero) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.numero = numero;
	}

	public int getLongueur() {
		return longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public int getNumero() {
		return numero;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
