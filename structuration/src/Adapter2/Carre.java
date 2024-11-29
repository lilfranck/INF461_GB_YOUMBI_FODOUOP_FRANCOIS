package Adapter2;

public class Carre implements ICarre{
	public float cote;
	public Carre(float cote) {
		super();
		this.cote=cote;
	}
	public float Aire() {
		return cote*cote;
	}
	
	public float Perimetre() {
		return cote*4;
	}

}
