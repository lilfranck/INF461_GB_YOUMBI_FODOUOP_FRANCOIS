package composite1;

import java.util.ArrayList;
import java.util.List;

public class Dossier extends Component{
	
	
	private String nom;
	private String type;
	private List<Component>sousdossier;
	
	
	
	public Dossier(String nom) {
		super();
		this.nom = nom;
		this.sousdossier = new ArrayList<Component>();
	}



	public void decrire() {
		int i;
		// TODO Auto-generated method stub
		System.out.println("------------------Dossier : " + this.nom + " ------------------");
	
		for(i=0; i<sousdossier.size();i++) {
			if(sousdossier.size()==0) {
				System.out.println("Dossier vide");
			}
			else if(sousdossier.get(i) instanceof Dossier) {
				sousdossier.get(i).decrire();
			}else if(sousdossier.get(i) instanceof Fichier) {
				sousdossier.get(i).decrire();
			}
		}
	
	}
	
	public void Ajouter(Component element) {
		sousdossier.add(element);
	}
	
	public void Supprimer(Component element) {
		int i;
		for(i=0; i<sousdossier.size();i++) {
			if(sousdossier.get(i)==element) {
				sousdossier.remove(i);
			}
		}
	}
	
	public Component Obtenir(int i) {
		return sousdossier.get(i);
	}

}
