package oop.polymorphism.shop.department;

import oop.polymorphism.shop.interfaces.DepartmentInterface;
import oop.polymorphism.shop.interfaces.EmployeeInterface;
import oop.polymorphism.shop.interfaces.ProductInterface;
import oop.polymorphism.shop.products.AbstractProduct;

public abstract class AbstractDepartment implements DepartmentInterface {
    public static int MAX_EMPLOYEES = 10;
    private String name;
    private EmployeeInterface[] employeeList;
    private ProductInterface[] productList;
    private int counterEmps;
    private int counterProducts;

    public AbstractDepartment(String name) {
        this.name = name;
        this.employeeList = new EmployeeInterface[MAX_EMPLOYEES];
        this.productList = new ProductInterface[AbstractProduct.MAX_PRODUCTS];
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public EmployeeInterface[] getEmployeeList() {
        return employeeList;
    }

    @Override
    public ProductInterface[] getProductList() {
        return productList;
    }

    public abstract void checkProduct(AbstractProduct abstractProduct);

    public void addEmployee(EmployeeInterface employee) {
        employeeList[counterEmps++] = employee;
    }

    public void addProduct(ProductInterface product) {
        productList[counterProducts++] = product;
    }
}
