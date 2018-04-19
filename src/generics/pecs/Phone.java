package generics.pecs;

public class Phone extends Product {
    private double displaySize;

    public Phone(double displaySize, String name, long price) {
        super(name, price);
        this.displaySize = displaySize;
    }
}
