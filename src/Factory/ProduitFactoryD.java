package Factory;

public class ProduitFactoryD extends ProductFactory {
	protected Produit createProduit() {
		Produit produit=null;
		produit=new ProduitD();
		return produit;
	}
}
