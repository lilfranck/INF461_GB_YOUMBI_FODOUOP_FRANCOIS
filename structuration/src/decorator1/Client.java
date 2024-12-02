package decorator1;

public class Client {
	 public static void main(String[] args){
	        Fenetre decorateurFenetre = new DecorateurCurseurHorizontal (new DecorateurCurseurVertical(new FenetreSimple() ));

	        System.out.println(decorateurFenetre.decrire());
	    }
	 }
