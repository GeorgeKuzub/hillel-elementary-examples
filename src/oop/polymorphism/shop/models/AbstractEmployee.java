package oop.polymorphism.shop.models;

import oop.polymorphism.shop.interfaces.DepartmentInterface;
import oop.polymorphism.shop.interfaces.EmployeeInterface;

public abstract class AbstractEmployee implements EmployeeInterface {
    private String name;
    private DepartmentInterface department;

    public AbstractEmployee(String name, DepartmentInterface department) {
        this.name = name;
        this.department = department;
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
    public boolean isFree() {
        return (Math.random() > 0.5 ? true : false );
    }

}
