package Adapter2;

public class AdaptTrapeze implements ICarre {
	Trapeze trap;
	public AdaptTrapeze(Trapeze trap) {
		super();
		this.trap = trap;
	}
	
	public float Aire() {
		return trap.Aire();
	}
	public float Perimetre() {
		return trap.Perimetre();
	}
}
