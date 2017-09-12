package oop.polymorphism.shop.service;

import oop.polymorphism.shop.Shop;
import oop.polymorphism.shop.interfaces.DepartmentInterface;
import oop.polymorphism.shop.interfaces.EmployeeInterface;

public class Admin {
    private Shop shop;

    public Admin(Shop shop) {
        this.shop = shop;
    }

    public Consultant getFreeConsultant(DepartmentInterface departmentInterface) {
        for (EmployeeInterface employee : departmentInterface.getEmployeeList()) {
            if (employee instanceof Consultant) {
                if (employee.isFree()) {
                    return (Consultant) employee;
                }
            }
        }
        return null;
    }
}