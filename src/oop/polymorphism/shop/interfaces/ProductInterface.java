package oop.polymorphism.shop.interfaces;

public interface ProductInterface {

    double getPrice();

    boolean hasWarranty();

    String getName();

    DepartmentInterface getDepartment();

    void setDepartment(DepartmentInterface department);

    String getManufacturer();
}
