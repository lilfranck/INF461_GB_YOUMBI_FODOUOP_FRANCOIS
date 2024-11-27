package Builder1;

public class Directeur {
	//contruire pizza reine
	public Pizza construirePizzaPiquante() {
	MonteurPizza pizzap=new MonteurPizzaPiquante();
	return pizzap.getPizza();
	}
	//contruire pizza Piquante
	public Pizza construirePizzaReine () {
	MonteurPizza pizzaReine=new MonteurPizzaReine();
	return pizzaReine.getPizza( );
	}
	
	public Pizza construirePizzaGlace () {
		MonteurPizza pizzaGlace=new MonteurPizzaGlace();
		return pizzaGlace.getPizza( );
		}
}