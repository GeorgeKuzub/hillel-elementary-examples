package oop.polymorphism.shop.service;


public class Manager extends AbstractEmployee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void report() {
        System.out.println("Report to Admin.");
    }

    public void sellGoods() {
    }

    public void getMoney() {

    }

    public void giveBonusCard() {

    }
}
