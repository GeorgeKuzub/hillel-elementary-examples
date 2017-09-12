package oop.polymorphism.shop.products;

import oop.polymorphism.shop.interfaces.ElectronicDeviceInterface;

public class Mixer extends AbstractProduct implements ElectronicDeviceInterface {
    public Mixer(String name) {
        super(name);
    }

    public Mixer(String name, boolean hasGuarantee, double price, String producer) {
        super(name, hasGuarantee, price, producer);
    }

    @Override
    public String getManufacturer() {
        return "Brunno";
    }

    @Override
    public float getDefaultWarranty() {
        return 0.5F;
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
