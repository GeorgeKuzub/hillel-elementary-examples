package oop.polymorphism.shop.interfaces;

public interface DepartmentInterface {
    int NUM_DEPS = 3;

    String getName();

    EmployeeInterface[] getEmployeeList();

    ProductInterface[] getProductList();
}
