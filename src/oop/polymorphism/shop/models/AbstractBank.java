package oop.polymorphism.shop.models;

import oop.polymorphism.shop.interfaces.BankInterface;

public abstract class AbstractBank implements BankInterface {
    private String name;

    public AbstractBank(String name) {
        this.name = name;
    }

    @Override
    public boolean checkInfo() {
        // Assume some request to appropriate government inspection
        return (Math.random() > 0.5 ? true : false);
    }

    @Override
    public void giveCredit() {
        // empty
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract String getCreditDescription();
}
