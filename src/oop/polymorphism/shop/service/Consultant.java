package oop.polymorphism.shop.service;

import oop.polymorphism.shop.Helper;
import oop.polymorphism.shop.enums.ConsultResult;
import oop.polymorphism.shop.interfaces.VisitorInterface;

public class Consultant extends AbstractEmployee {
    public Consultant(String name) {
        super(name);
    }

    @Override
    public void report() {
        System.out.println("Report to Manager");
    }

    public ConsultResult consult(VisitorInterface visitorInterface) {
        super.setFree(false);
        return (Helper.getChoice() ? ConsultResult.BUY : ConsultResult.LEAVE);
    }
}
