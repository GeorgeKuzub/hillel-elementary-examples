package task25.logic;

import task25.enums.DepTypes;
import task25.interfaces.EmployeeManager;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class EmployeeManagerImpl implements EmployeeManager {
    private Set<Department> departments;

    private Department depDefault;
    private Department depDep1;
    private Department depDep2;
    private Department depDep3;

    public EmployeeManagerImpl() {
        departments = new HashSet<>();

        depDefault = new Department(DepTypes.DEFAULT);
        depDep1 = new Department(DepTypes.DEP1);
        depDep2 = new Department(DepTypes.DEP2);
        depDep3 = new Department(DepTypes.DEP3);

        departments.add(depDefault);
        departments.add(depDep1);
        departments.add(depDep2);
        departments.add(depDep3);

    }

    @Override
    public void addEmployee(Employee employee) {
        int random = new Random().nextInt(3);
        switch (random) {
            case 1:
                depDep1.addEmployee(employee);
                break;
            case 2:
                depDep2.addEmployee(employee);
                break;
            case 3:
                depDep3.addEmployee(employee);
                break;
            default:
                depDefault.addEmployee(employee);
        }
    }

    @Override
    public void removeEmployee(Employee employee) {
        for (Department department : departments) {
            if (department.getEmployee(employee) != null) {
                department.remove(employee);
            }
        }
    }

    @Override
    public Employee getEmployee(String empName) {
        for (Department department : departments) {
            Employee emp = department.getEmployee(empName);
            if (emp != null) {
                return emp;
            }
        }
        return null;
    }

    @Override
    public Employee[] getAllEmployees() {
        Set<Employee> resultSet = new HashSet<>();
        for (Department department : departments) {
            resultSet.addAll(department.getEmployeeSet());
        }

        return resultSet.toArray(new Employee[resultSet.size()]);
    }

    @Override
    public Employee[] getAllEmployees(Department department) {
        Set<Employee> resultSet = new HashSet<>();
        for (Department dep : departments) {
            if (dep.equals(department)) {
                resultSet.addAll(dep.getEmployeeSet());
            }
        }
        return resultSet.toArray(new Employee[resultSet.size()]);
    }

    @Override
    public void addSalary(String name, long salary) {
        getEmployee(name).setSalary(salary);
    }

}
