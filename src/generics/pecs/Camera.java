package generics.pecs;

public class Camera extends Product {
    private int pixels;

    public Camera(int pixels, String name, long price) {
        super(name, price);
        this.pixels = pixels;
    }
}
