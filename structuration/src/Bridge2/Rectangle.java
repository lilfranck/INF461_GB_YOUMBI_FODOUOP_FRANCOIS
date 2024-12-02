package Bridge2;

public class Rectangle extends Forme{
	Rectangle(Couleur color){
		super(color);
	}
	public void colorier() {
		System.out.println("Rectangle avec pour couleur :");
		couleur.remplirCouleur();
	}

}
