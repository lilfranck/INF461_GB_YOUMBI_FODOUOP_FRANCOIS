package composite1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------PATRON COMPOSITE ----------------");
		Fichier fichiertxt = new FichierTXT("fichier1");
		Fichier fichierpdf = new FichierPDF("fichier2");
		
		fichiertxt.decrire();
		fichierpdf.decrire();
		
		Dossier dossier = new Dossier("dossier1");		
		dossier.Ajouter(fichierpdf);
		dossier.Ajouter(fichiertxt);
		dossier.decrire();
	}

}
