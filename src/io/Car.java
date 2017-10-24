package io;

import java.io.Serializable;

public class Car implements Serializable {
//    private static final long serialVersionUID = 1;
    private final String brand;
    private final String owner;
    private final int year2;
    private transient Tenant tenant;

    public Car(String brand, int year, String owner) {
        System.out.println("in car constructor with three parameters");
        this.brand = brand;
        this.year2 = year;
        this.owner = owner;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year2=" + year2 +
                ", owner=" + owner +
                ", tenant=" + tenant +
                '}';
    }
}
