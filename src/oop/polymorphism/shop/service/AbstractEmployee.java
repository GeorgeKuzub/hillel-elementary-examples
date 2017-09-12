package oop.polymorphism.shop.service;

import oop.polymorphism.shop.Helper;
import oop.polymorphism.shop.interfaces.DepartmentInterface;
import oop.polymorphism.shop.interfaces.EmployeeInterface;

public abstract class AbstractEmployee implements EmployeeInterface {
    private String name;
    private DepartmentInterface department;
    private boolean free;

    public AbstractEmployee(String name) {
        this.name = name;
        free = Helper.getChoice();
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
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public abstract void report();
}
