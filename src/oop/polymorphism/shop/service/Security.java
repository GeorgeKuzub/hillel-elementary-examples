package oop.polymorphism.shop.service;

public class Security extends AbstractEmployee {
    public Security(String name) {
        super(name);
    }

    @Override
    public void report() {
        System.out.println("Report to Security Agency");
    }

    public void checkVisitor() {

    }

    public void openDoor() {

    }

    public void closeDoor() {

    }

}
