package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        // Init our objects
        Employee emp_AntonKuzmenko = new Employee("Anton Kuzmenko", 100, 2015, 01, 31);
        Employee emp_TarasShevchenko = new Employee("Taras Shevchenko", 100, 2010, 06, 01);
        Employee emp_AnatoliyVolkov = new Employee("Anatoliy Volkov", 100, 2010, 06, 01);

        Manager man_AntuanGorilkin = new Manager("Valdemar Gorilkin", 100, 2010, 06, 01);
        Manager man_RobertTorpedov = new Manager("Robert Maslov", 100, 2010, 06, 01);

        President ceo_PanasMerzotov = new President("Panas Merzotov");

        // Make some action under our objects
        emp_AntonKuzmenko.report();
        System.out.println("ID of AntonKuzmenko is " + emp_AntonKuzmenko.getId());
        System.out.println();

        emp_TarasShevchenko.report();
        System.out.println("ID of Tarar Shevchenko is " + emp_TarasShevchenko.getId());
        System.out.println();

        emp_AnatoliyVolkov.report();
        System.out.println("ID of Anatoliy Volkov is " + emp_AnatoliyVolkov.getId());
        System.out.println();


        ceo_PanasMerzotov.fire(emp_AnatoliyVolkov);
        man_AntuanGorilkin.warnAboutFire(emp_AnatoliyVolkov);
        System.out.println("Is Anatoliy Volkov fired? The answer is  " + emp_AnatoliyVolkov.getFired());

        ceo_PanasMerzotov.letVacation(emp_AntonKuzmenko);
        man_RobertTorpedov.warnEndVacation(emp_AntonKuzmenko);
        System.out.println("Is Anaton Kuzmenko on vacation? The answer is  " + emp_AnatoliyVolkov.getVacation());

        ceo_PanasMerzotov.letBonusToSalary(emp_TarasShevchenko);
        System.out.println("The current salary of Taras Shevchenko is " + emp_TarasShevchenko.getSalary());

        System.out.println("The current salary of our President is " + ceo_PanasMerzotov.getSalary());

        ceo_PanasMerzotov.annulYearReport();

    }
}
