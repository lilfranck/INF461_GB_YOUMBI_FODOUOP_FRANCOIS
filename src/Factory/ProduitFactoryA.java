package Factory;

public class ProduitFactoryA extends ProductFactory {
	protected Produit createProduit() {
		Produit produit=null;
		produit=new ProduitA();
		return produit;
	}
}
