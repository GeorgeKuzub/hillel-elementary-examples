package task25;

import task25.enums.DepTypes;
import task25.interfaces.EmployeeManager;
import task25.logic.Department;
import task25.logic.Employee;
import task25.logic.EmployeeManagerImpl;

public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManagerImpl();
        init(employeeManager);

        Employee ivanov = employeeManager.getEmployee("Иванов Иван Иванович");
        System.out.println("Getting Ivanov employee:");
        System.out.println(ivanov);
        System.out.println();

        System.out.println("Getting all employees in DEFAULT department:");
        printEmployeesByDepartment(employeeManager, DepTypes.DEFAULT);
        System.out.println();

        System.out.println("Getting all employees in all deparments:");
        printAllEmployees(employeeManager);
        System.out.println();

        Employee sidorov = employeeManager.getEmployee("Сидоров Сидор Сидорович");
        System.out.println("Current Sidorov's salary is: " + sidorov.getSalary());
        employeeManager.addSalary("Сидоров Сидор Сидорович", 1000);
        System.out.println("Sidorov's salary after promotion is: " + sidorov.getSalary());

        System.out.println("Sidorov must be fired!");
        employeeManager.removeEmployee(sidorov);

        System.out.println("Getting all employees in all deparments without Sidorov");
        printAllEmployees(employeeManager);
        System.out.println();
    }

    private static void printEmployeesByDepartment(EmployeeManager employeeManager, DepTypes depType) {
        printArray(employeeManager.getAllEmployees(new Department(depType)));
    }

    private static void printAllEmployees(EmployeeManager employeeManager) {
        printArray(employeeManager.getAllEmployees());
    }

    private static void printArray(Employee[] allEmployees) {
        for (Employee emp : allEmployees) {
            System.out.println(emp);
        }
    }

    private static void init(EmployeeManager employeeManager) {
        Employee emp1 = new Employee("Иванов Иван Иванович", "095111111111", 100);
        Employee emp2 = new Employee("Петров Петр Петрович", "095222222222", 200);
        Employee emp3 = new Employee("Сидоров Сидор Сидорович", "095333333333", 300);
        Employee emp4 = new Employee("Арсеньев Арсений Арсеньевич", "095444444444", 400);
        Employee emp5 = new Employee("Глебов Глеб Глебович", "095555555555", 500);

        employeeManager.addEmployee(emp1);
        employeeManager.addEmployee(emp2);
        employeeManager.addEmployee(emp3);
        employeeManager.addEmployee(emp4);
        employeeManager.addEmployee(emp5);
    }
}
