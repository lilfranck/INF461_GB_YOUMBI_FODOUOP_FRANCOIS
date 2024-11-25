package factoryMethod;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------Bonjour le monde ----------------");
		FabriqueProduit fabriqueproduit= new FabriqueProduit();
		Produit produit=null;
		produit=fabriqueproduit.createProduit(fabriqueproduit.typeA);
		produit.methodeproduit();
		produit=fabriqueproduit.createProduit(fabriqueproduit.typeB);
		produit.methodeproduit();
		produit=fabriqueproduit.createProduit(fabriqueproduit.typeC);
		produit.methodeproduit();
		produit=fabriqueproduit.createProduit(fabriqueproduit.typeD);
		produit.methodeproduit();
		
		String f = "F";
		produit=fabriqueproduit.createProduit(f);
		produit.methodeproduit();
	}

}
