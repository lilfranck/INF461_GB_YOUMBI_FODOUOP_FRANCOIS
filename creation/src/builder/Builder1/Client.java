package Builder1;

public class Client {
	public static void main(String[] args) {
	Directeur directeur=new Directeur ();

	System.out.println("..Pizza Reine Fabriquee..");
	directeur.construirePizzaReine( ).print();

	System.out.println("..Pizza Piquante Fabriquee..");
	directeur.construirePizzaPiquante( ).print();

	System.out.println("..Pizza Glace Fabriquee..");
	directeur.construirePizzaGlace( ).print();

	}
}
