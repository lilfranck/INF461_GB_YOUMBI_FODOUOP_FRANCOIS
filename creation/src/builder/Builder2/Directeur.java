package Builder2;

public class Directeur {
	
	public Burger construireBurgerKing() {
	MonteurBurger burgerking=new MonteurBurgerKing();
	return burgerking.getBurger();
	}
	public Burger construireBurgerRoyal() {
	MonteurBurger burgerRoyal=new MonteurBurgerRoyal();
	return burgerRoyal.getBurger( );
	}
	}