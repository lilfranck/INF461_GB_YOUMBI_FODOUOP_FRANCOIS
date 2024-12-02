package Bridge2;

public class Client {

	
	public static void main(String[] args) {
		
		Forme s1=new Rectangle(new CouleurRouge());
		s1.colorier();
		
		Forme c1=new Cercle(new CouleurRouge());
		c1.colorier();
		
		Forme t1=new Triangle(new CouleurRouge());
		t1.colorier();
		
		Forme s2=new Rectangle(new CouleurBleu());
		s2.colorier();
		
		Forme c2=new Cercle(new CouleurBleu());
		c2.colorier();
		
		Forme t2=new Triangle(new CouleurBleu());
		t2.colorier();
		
		Forme s3=new Rectangle(new CouleurVerte());
		s3.colorier();
		
		Forme c3=new Cercle(new CouleurVerte());
		c3.colorier();
		
		Forme t3=new Triangle(new CouleurVerte());
		t3.colorier();
		
		c1=c2;
		c1.colorier();
		
	}
}
