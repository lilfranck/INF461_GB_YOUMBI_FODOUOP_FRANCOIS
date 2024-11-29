package composite2;

public class FichierPDF extends Fichier {

	public FichierPDF(String nom) {
		super();
		this.nom=nom;
		this.type="pdf";
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void decrire() {
		// TODO Auto-generated method stub
		System.out.println("Fichier : " + this.nom + "  de type : " + this.type);
	}

}
