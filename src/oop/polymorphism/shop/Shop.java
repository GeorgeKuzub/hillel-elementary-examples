package oop.polymorphism.shop;

import oop.polymorphism.shop.interfaces.DepartmentInterface;
import oop.polymorphism.shop.interfaces.VisitorInterface;

public class Shop {
    static final int MAX_DEPS = 5;
    static final int MAX_VISITORS = 10;
    private static final String SHOP_NAME = "Super-Puper-Shop";
    private int counterDep;
    private int counterVisitor;

    private DepartmentInterface[] departmentList = new DepartmentInterface[MAX_DEPS];

    private VisitorInterface[] visitorList = new VisitorInterface[MAX_VISITORS];

    public DepartmentInterface[] getDepartmentList() {
        return departmentList;
    }

    public void addDepartment(DepartmentInterface department) {
        departmentList[counterDep++] = department;
    }

    public void addVisitor(VisitorInterface visitor) {
        visitorList[counterVisitor++] = visitor;
    }

}
