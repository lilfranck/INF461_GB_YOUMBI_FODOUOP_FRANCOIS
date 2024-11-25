package Factory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------Methode 2 : Abstract Factory----------------");
		ProductFactory produitfactoryA = new ProduitFactoryA();
		ProductFactory produitfactoryB = new ProduitFactoryB();
		ProductFactory produitfactoryC = new ProduitFactoryC();
		ProductFactory produitfactoryD = new ProduitFactoryD();
		Produit produit=null;
		
		produit = produitfactoryA.getProduit();
		produit.methodeproduit();
		produit = produitfactoryB.getProduit();
		produit.methodeproduit();
		produit = produitfactoryC.getProduit();
		produit.methodeproduit();
		produit = produitfactoryD.getProduit();
		produit.methodeproduit();
		}

}
