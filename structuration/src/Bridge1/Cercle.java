package Bridge1;

public class Cercle extends Forme {
	Cercle(Couleur color){
		super(color);
	}
	public void colorier() {
		System.out.println("Cercle rempli de :");
		couleur.remplirCouleur();
	}
}
