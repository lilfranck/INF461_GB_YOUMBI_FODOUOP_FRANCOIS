package Builder2;

public class Burger {
	private String pain = "";
	private String sauce = "";
	private String viande = "";
	private String garniture = " ";
	private String fromage = "";
	public void setPain (String pain)
		{ this.pain = pain; }
	public void setSauce (String sauce)
		{ this.sauce = sauce; }
	public void setGarniture(String garniture) { this.garniture =
		garniture; }
//	public void print() {
//		System.out.println(this.toString ()) ;
//		System.out.println("Pate = "+ this.pate + "\n Sauce = " + this. sauce +"\n Garniture = " +this. garniture);
//	}
	public void setViande(String viande) {
		this.viande = viande;
	}
	public void setFromage(String fromage) {
		this.fromage = fromage;
	}
public void print() {
System.out.println( "Burger [pain=" + this.pain + ", sauce=" + this.sauce + ", viande=" + this.viande + ", garniture=" + this.garniture+ ", fromage=" + this.fromage + "]");
	}
}
	
	