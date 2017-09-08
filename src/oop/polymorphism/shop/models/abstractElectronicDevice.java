package oop.polymorphism.shop.models;

import oop.polymorphism.shop.interfaces.ElectronicDeviceInterface;

public abstract class abstractElectronicDevice implements ElectronicDeviceInterface {
    @Override
    public void on() {
        // turn on
    }

    @Override
    public void off() {
        // turn off
    }
}
