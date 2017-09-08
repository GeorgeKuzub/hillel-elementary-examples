package oop.polymorphism.shop.models;

import oop.polymorphism.shop.interfaces.DepartmentInterface;
import oop.polymorphism.shop.interfaces.EmployeeInterface;
import oop.polymorphism.shop.interfaces.GoodsInterface;

public abstract class AbstractDepartment implements DepartmentInterface{
    private String name;
    private EmployeeInterface[] employeeList;
    private GoodsInterface[] goodsList;
    private int counterGoods;
    private int counterEmp;

    public AbstractDepartment(String name) {
        this.name = name;
        employeeList = new EmployeeInterface[20];
        goodsList = new GoodsInterface[100];
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
    public GoodsInterface[] getGoodsList() {
        return goodsList;
    }

    public void addGoods(GoodsInterface goods) {
        goodsList[counterGoods++] = goods;
    }

    public void addEmployee(EmployeeInterface employeeInterface) {
        employeeList[counterEmp++] = employeeInterface;
    }
}
