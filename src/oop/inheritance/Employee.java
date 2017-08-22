package oop.inheritance;

import java.util.Random;

public class Employee {
    private int id;
    private String name = "Unknown";
    private long year;
    private long salary = 100;
    private boolean vacation = false;
    private boolean fired = false;

    public Employee(int i, long y, String n) {
        this.id = id;
        this.year = year;
        this.name = name;
    }

    public Employee(long y, String n) {
        this(new Random().nextInt(100), y, n);
    }

    public Employee() {
    }

    void report() {
        System.out.println("I've done it successfully");
    }

    long getSalary() {
        return salary;
    }

    void setSalary(long salary) {
        this.salary = salary;
    }
}
