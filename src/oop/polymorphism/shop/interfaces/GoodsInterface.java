package oop.polymorphism.shop.interfaces;

public interface GoodsInterface {
    double getPrice();

    boolean hasWarranty();

    String getName();

    DepartmentInterface getDepartment();

    void setDepartment(DepartmentInterface department);

    String getManufacturer();
}
