package Factory;

public class ProduitFactoryC extends ProductFactory {
	protected Produit createProduit() {
		Produit produit=null;
		produit=new ProduitC();
		return produit;
	}
}
