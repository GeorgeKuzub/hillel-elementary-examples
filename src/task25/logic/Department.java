package task25.logic;

import task25.enums.DepTypes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Department {
    private DepTypes depType;
    private Set<Employee> employeeSet;

    public Department(DepTypes name) {
        this.depType = name;
        employeeSet = new HashSet<>();
    }

    public DepTypes getDepType() {
        return depType;
    }

    public void addEmployee(Employee emp) {
        employeeSet.add(emp);
    }

    public Employee getEmployee(String empName) {
        Iterator<Employee> iter = employeeSet.iterator();
        while (iter.hasNext()) {
            Employee currentEmp = iter.next();
            if (currentEmp.getName().equals(empName)) {
                return currentEmp;
            }
        }
        return null;
    }

    public Employee getEmployee(Employee employee) {
        Iterator<Employee> iter = employeeSet.iterator();
        while (iter.hasNext()) {
            Employee currentEmp = iter.next();
            if (currentEmp.equals(employee)) {
                return employee;
            }
        }
        return null;
    }

    public void remove(Employee emp) {
        Set<Employee> employees = new HashSet<>(employeeSet);
        employees.remove(emp);
        employeeSet = employees;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;

        Department that = (Department) o;

        if (depType != that.depType) return false;
        return depType != null ? depType.equals(that.depType) : that.depType == null;
    }

    @Override
    public int hashCode() {
        int result = depType != null ? depType.hashCode() : 0;
        return result;
    }

    @Override
    public String toString() {
        return "Department{" + "depType=" + depType + '}';
    }
}
