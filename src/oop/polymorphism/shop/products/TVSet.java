package oop.polymorphism.shop.products;

public class TVSet extends Monitor {
    private int numTVChannels;

    public TVSet(String name, int numChannels) {
        super(name);
        this.numTVChannels = numChannels;
    }

    public TVSet(String name, boolean hasGuarantee,
                 double price, String producer, int numTVChannels) {
        super(name, hasGuarantee, price, producer);
        this.numTVChannels = numTVChannels;
    }

    public int getNumTVChannels() {
        return numTVChannels;
    }

}
