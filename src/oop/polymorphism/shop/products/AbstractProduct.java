package oop.polymorphism.shop.products;

import oop.polymorphism.shop.Helper;
import oop.polymorphism.shop.interfaces.DepartmentInterface;
import oop.polymorphism.shop.interfaces.ProductInterface;

public abstract class AbstractProduct implements ProductInterface {
    public static final float DEFAULT_WARRANTIES = 1; // in years
    public static final int MAX_PRODUCTS = 100;

    private String name;
    private boolean hasWarranty;
    private double price;
    private String producer;
    private DepartmentInterface department;

    public AbstractProduct() {
    }

    public AbstractProduct(String name) {
        this.name = name;
    }


    public AbstractProduct(String name, boolean hasGuarantee, double price, String producer) {
        this.name = name;
        this.hasWarranty = Helper.getChoice();
        this.price = price;
        this.producer = producer;
    }

    @Override
    public double getPrice() {
        return price;
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
    public boolean hasWarranty() {
        return hasWarranty;
    }

    @Override
    public abstract String getManufacturer();

    public abstract float getDefaultWarranty();

}
