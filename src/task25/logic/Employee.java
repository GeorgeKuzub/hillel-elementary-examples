package task25.logic;

public class Employee {
    private String name;
    private String telephone;
    private long salary;

    public Employee(String name, String telephone, long salary) {
        this.name = name;
        this.salary = salary;
        this.telephone = telephone;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (salary != employee.salary) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return telephone != null ? telephone.equals(employee.telephone) : employee.telephone == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (int) (salary ^ (salary >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + "'}";
    }
}
