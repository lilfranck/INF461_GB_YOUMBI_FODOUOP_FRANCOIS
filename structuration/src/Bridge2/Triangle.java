package Bridge2;

public class Triangle extends Forme {
	Triangle(Couleur color){
		super(color);
	}
	public void colorier() {
		System.out.println("Triangle rempli de :");
		couleur.remplirCouleur();
	}
}