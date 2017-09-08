package oop.polymorphism.shop.models;

import oop.polymorphism.shop.interfaces.DepartmentInterface;
import oop.polymorphism.shop.interfaces.GoodsInterface;

public abstract class AbstractGoods implements GoodsInterface {
    private static final int DEFAULT_GUARANTEE = 1;
    private double price;
    private boolean hasWarranty;
    private String name;
    private DepartmentInterface department;
    private String manufacturer;

    public AbstractGoods(double price, boolean hasGuarantee, String name, String manufacturer) {
        this.price = price;
        this.hasWarranty = hasGuarantee;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public AbstractGoods(double price, boolean hasGuarantee, String name, DepartmentInterface department, String manufacturer) {
        this.price = price;
        this.hasWarranty = hasGuarantee;
        this.name = name;
        this.department = department;
        this.manufacturer = manufacturer;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean hasWarranty() {
        return hasWarranty;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(DepartmentInterface department) {
        this.department = department;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }
}
