package jcf;

public class Car {
    private String name;
    private int year;

    public Car(String model, int year) {
        this.name = model;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + year + "; ";
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        return name != null ? name.equals(car.name) && year == car.year: car.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() + year*17: 0;
    }

}
