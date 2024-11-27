package Builder2;

public class Client {
	public static void main(String[] args) {
	Directeur directeur=new Directeur ();

	System.out.println("..Burger King Fabriquee..");
	directeur.construireBurgerKing( ).print();

	System.out.println("..Burger Royal Fabriquee..");
	directeur.construireBurgerRoyal( ).print();

	}
}
