package decorator2;

public class Client {
	 public static void main(String[] args){
	        Fenetre decorateurFenetre = new DecorateurAgLuminosite(new DecorateurCurseurHorizontal (new DecorateurCurseurVertical(new FenetreSimple() )));

	        System.out.println(decorateurFenetre.decrire());
	    }
	 }
