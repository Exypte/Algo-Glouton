import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import batiment.Batiment;
import matriceTerrain.Terrain;

public class Instance {

	private Terrain terrain;
	private int nombreBatiment;
	private ArrayList<Batiment> batiments;
	
	public Instance() {
		this.batiments = new ArrayList<>();
	}
	
	public void lectureInstance(String nomFichier) {
		try {
			FileReader fileReader = new FileReader(nomFichier);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line;
			String tmp[];
			
			try {
				line = bufferedReader.readLine();
				
				tmp = line.split(" ");
				this.terrain =  new Terrain(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]));
			
				
				line = bufferedReader.readLine();
				nombreBatiment = Integer.parseInt(line);
				
				for(int i = 0; i < this.nombreBatiment; i++) {
					line = bufferedReader.readLine();

					System.out.println(line.toString());
					tmp = line.split(" ");

					batiments.add(new Batiment(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), i));
				}
				
				bufferedReader.close();
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Terrain getTerrain() {
		return terrain;
	}

	public int getNombreBatiment() {
		return nombreBatiment;
	}

	public ArrayList<Batiment> getBatiments() {
		return batiments;
	}

	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}

	public void setNombreBatiment(int nombreBatiment) {
		this.nombreBatiment = nombreBatiment;
	}

	public void setBatiments(ArrayList<Batiment> batiments) {
		this.batiments = batiments;
	}
}
