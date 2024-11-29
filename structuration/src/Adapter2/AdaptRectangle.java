package Adapter2;

public class AdaptRectangle implements ICarre{
	Rectangle rect;
	public AdaptRectangle(Rectangle rect) {
		super();
		this.rect = rect;
	}
	public float Aire() {
		return rect.Aire();
	}
	
	public float Perimetre() {
		return rect.Perimetre();
	}
}
