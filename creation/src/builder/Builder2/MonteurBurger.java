package Builder2;

public abstract class MonteurBurger {
	protected Burger burger=new Burger() ;
	public Burger getBurger() {
	monterPain( ) ;
	monterSauce();
	monterViande();
	monterGarniture();
	monterFromage();
	return burger;}
	
	public abstract void monterPain();
	public abstract void monterViande();
	public abstract void monterSauce ();
	public abstract void monterGarniture();
	public abstract void monterFromage();
}