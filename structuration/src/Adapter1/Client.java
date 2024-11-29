package Adapter1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carre carre = new Carre(10);
		System.out.println(carre.Aire());
		System.out.println(carre.Perimetre());
		
		AdaptRectangle adaptRectangle = new AdaptRectangle(new Rectangle (12,2));
		System.out.println("l'aire du rectangle est : " +adaptRectangle.Aire());
		System.out.println("le perimetre du rectangle est : " +adaptRectangle.Perimetre());

	}

}
