package Bridge1;

public class Client {

	
	public static void main(String[] args) {
		
		Forme s1=new Rectangle(new CouleurRouge());
		s1.colorier();
		
		Forme c1=new Cercle(new CouleurRouge());
		c1.colorier();
		
		Forme s2=new Rectangle(new CouleurBleu());
		s2.colorier();
		
		Forme c2=new Cercle(new CouleurBleu());
		c2.colorier();
		
		c1=c2;
		c1.colorier();
		
	}
}
