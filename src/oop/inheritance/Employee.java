package oop.inheritance;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee {
    private static int static_id = 0;

    private int id;
    private String name;
    private long salary;
    private Calendar hireDay;
    private boolean vacation = false;
    private boolean fired = false;
    private long bonusSalary;

    Employee(String name, long salary, int year, int month, int day) {
        this.id = genId();

        this.name = name;
        this.salary = salary;
        this.hireDay = new GregorianCalendar(year, month - 1, day);
        this.bonusSalary = 0;
    }

//    //Default constructor that always exists
//    Employee() {
//        // It doesn't need to create a default constructor except some special cases
//    }


    Employee(String n) {
        this(n, 0, 0, 0, 0);
    }

    private static int genId() {
        return ++static_id;
    }

    void report() {
        System.out.println("I am the " + getMyProfession() + " and my name is " + name + ".");
        System.out.println("All my works have been done successfully.");
    }


    public int getId() {
        return id;
    }

    long getSalary() {
        return salary;
    }

    void setSalary(long salary) {
        this.salary = salary + bonusSalary;
    }

    Calendar getHireDay() {
        return hireDay;
    }

    boolean getFired() {
        return fired;
    }

    void setFired() {
        fired = true;
    }

    boolean getVacation() {
        return vacation;
    }

    void setVacation(boolean statusVacation) {
        vacation = statusVacation;
    }

    public void setBonusSalary(long bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    private String getMyProfession() {
        return getClass().getSimpleName();
    }


}
