package Factory;

public class ProduitFactoryB extends ProductFactory {
	protected Produit createProduit() {
		Produit produit=null;
		produit=new ProduitB();
		return produit;
	}
}
