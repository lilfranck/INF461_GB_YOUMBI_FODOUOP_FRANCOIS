package Bridge1;

public abstract class Forme {
	Couleur couleur;
	Forme(Couleur color){
		this.couleur=color;
	}	
	abstract public void colorier();
}
