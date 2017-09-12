package oop.polymorphism.shop.bank;

import oop.polymorphism.shop.Helper;
import oop.polymorphism.shop.interfaces.BankInterface;

public abstract class AbstractBank implements BankInterface {
    private static int totalRequestCount;

    private String name;
    private String creditDescription;

    public AbstractBank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

    private static int getRequestCountInfo() {
        return totalRequestCount;
    }

    @Override
    public abstract void giveCredit();

    @Override
    public boolean checkInfo() {
        totalRequestCount++;
        //It might be a request to a central tax inspection
        return Helper.getChoice();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
