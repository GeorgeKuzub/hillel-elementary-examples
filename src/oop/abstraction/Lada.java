package oop.abstraction;

/**
 * Created by MBCNEWMAIN on 11.03.2016.
 */
public class Lada extends Auto implements Repairable {

    public Lada(int year) {
        super(year);
    }

    public String getMark() {
        return "LADA";
    }

    @Override
    public void repair() {
        System.out.println("repaired");
    }
}
