package composite2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------PATRON COMPOSITE 2----------------");
		Fichier fichiertxt = new FichierTXT("fichier1");
		Fichier fichierpdf = new FichierPDF("fichier2");
		Fichier fichiermp4 = new FichierMP4("fichier3");
		
		fichiertxt.decrire();
		fichierpdf.decrire();
		fichiermp4.decrire();
		
		Dossier dossier = new Dossier("dossier1");		
		dossier.Ajouter(fichierpdf);
		dossier.Ajouter(fichiertxt);
		dossier.decrire();
	}

}
