package Factory;

public abstract class ProductFactory {
	public Produit getProduit() {
		return createProduit();
	}
	protected abstract Produit createProduit();
}
