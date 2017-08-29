package oop.inheritance;

public class Manager extends Employee {
    final private int SALARY_BONUS = 25; // salary bonus in persent

    public Manager(String name, long salary, int year, int month, int day) {
        super(name, (int) (salary * 25 / 100 + salary), year, month, day);
    }

    void warnAboutFire(Employee emp) {
        System.out.println("The manager says: The employee with ID " + emp.getId() + " is going to be fired in 2 weeks.");
    }

    void warnEndVacation(Employee emp) {
        System.out.println("The manager says: The employee with ID " + emp.getId() + " should come back to work in 3 days.");
    }

}
