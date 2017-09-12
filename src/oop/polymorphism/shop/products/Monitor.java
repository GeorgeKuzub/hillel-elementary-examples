package oop.polymorphism.shop.products;

import oop.polymorphism.shop.interfaces.ElectronicDeviceInterface;

public class Monitor extends AbstractProduct implements ElectronicDeviceInterface {

    public Monitor(String name) {
        super(name);
    }

    public Monitor(String name, boolean hasGuarantee, double price, String producer) {
        super(name, hasGuarantee, price, producer);
    }

    @Override
    public String getManufacturer() {
        return "DELL";
    }

    @Override
    public float getDefaultWarranty() {
        return (float) (AbstractProduct.DEFAULT_WARRANTIES + 2);
    }

    @Override
    public boolean on() {
        return true;
    }

    @Override
    public boolean off() {
        return false;
    }
}
