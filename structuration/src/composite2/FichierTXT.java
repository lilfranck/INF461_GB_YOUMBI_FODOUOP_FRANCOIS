package composite2;

public class FichierTXT extends Fichier {

	
	public FichierTXT(String nom) {
		super();
		this.nom=nom;
		this.type="txt";
		// TODO Auto-generated constructor stub
	}


	public void decrire() {
		// TODO Auto-generated method stub
		System.out.println("Fichier : " + this.nom + "  de type : " + this.type);
	}
}
