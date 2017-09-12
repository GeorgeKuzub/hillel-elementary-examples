package oop.polymorphism.shop.service;

import oop.polymorphism.shop.interfaces.BankInterface;

public class Banker extends AbstractEmployee {
    private BankInterface bank;

    public Banker(String name, BankInterface bank) {
        super(name);
        this.bank = bank;
    }

    @Override
    public void report() {
        System.out.println("Report to Bank.");
    }

    public void sendRequest() {
        bank.checkInfo();
    }

}
