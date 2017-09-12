package oop.polymorphism.shop.products;

public class Chair extends AbstractProduct {
    public Chair(String name) {
        super(name);
    }

    @Override
    public boolean hasWarranty() {
        return false;
    }

    @Override
    public String getManufacturer() {
        return "Factory <Strii>";
    }

    @Override
    public float getDefaultWarranty() {
        return AbstractProduct.DEFAULT_WARRANTIES + 1;
    }

}
