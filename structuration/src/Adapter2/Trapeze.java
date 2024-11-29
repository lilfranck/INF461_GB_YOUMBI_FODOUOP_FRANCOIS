package Adapter2;

public class Trapeze {
	public float cote1;
	public float cote2;
	public float gbase;
	public float pbase;
	public float hauteur;
	
	public Trapeze(float cote1, float cote2, float gbase, float pbase, float hauteur) {
		this.cote1 = cote1;
		this.gbase = gbase;
		this.cote2 = cote2;
		this.pbase = pbase;
		this.hauteur = hauteur;
	}
	
	public float Aire() {
		return ((pbase+gbase)*hauteur)/2;
	}
	public float Perimetre() {
		return gbase+pbase+cote1+cote2;
	}

}