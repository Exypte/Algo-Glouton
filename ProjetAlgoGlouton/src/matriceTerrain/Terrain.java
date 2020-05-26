package matriceTerrain;

import java.util.ArrayList;

import batiment.BatimentPosition;

public class Terrain {
	private int longueur;
	private int largeur;
	ArrayList<BatimentPosition> terrain;
	
	public Terrain(int longueur, int largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
		this.terrain = new ArrayList<>();
	}

	public int getLongueur() {
		return longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public ArrayList<BatimentPosition> getTerrain() {
		return terrain;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public void setTerrain(ArrayList<BatimentPosition> terrain) {
		this.terrain = terrain;
	}
}
