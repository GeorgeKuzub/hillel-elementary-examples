package oop.inheritance;

public class Manager extends Employee {

    public Manager() {
        super(2, 2000, "Ivanov Petr Ivanovich");
        setSalary((long) (getSalary() * 1.25));
    }

    public Manager(int id, long year, String name) {
        super(id, year, name);
    }

    void fire(int id) {
        System.out.println("The employee with ID +" + id + "is fired");
    }

    void reportToCeo() {
        report();
    }

}
