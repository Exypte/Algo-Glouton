package batiment;

public class BatimentPosition {
	
	private Batiment batiment;
	private int x;
	private int y;
	
	public BatimentPosition(Batiment batiment, int x, int y) {
		super();
		this.batiment = batiment;
		this.x = x;
		this.y = y;
	}

	public Batiment getBatiment() {
		return batiment;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setBatiment(Batiment batiment) {
		this.batiment = batiment;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
