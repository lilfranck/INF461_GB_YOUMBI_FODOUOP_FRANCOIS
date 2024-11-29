package composite2;


public class FichierMP4 extends Fichier {

	public FichierMP4(String nom) {
		super();
		this.nom=nom;
		this.type="mp4";
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void decrire() {
		// TODO Auto-generated method stub
		System.out.println("Fichier : " + this.nom + "  de type : " + this.type);
	}

}