package jcf;

import java.util.*;

public class DemoSet {
    public static void main(String[] args) {
//        treeSetDemo();
//        hashSetDemo();
        hashSetCarDemo();

    }

    private static void hashSetCarDemo() {
        Car car1 = new Car("Ford", 1990);
        Car car2 = new Car("Nissan", 2001);
        Car car3 = new Car("Lada", 1992);
        Car car4 = new Car("Toyota", 1923);
        Car car5 = new Car("KIA", 1234);
        Car car6 = new Car("KIA", 2001);
        Car car7 = new Car("DODGE", 2130);

        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);

        // Do not do it
//        for (Car car: newCars) {
//            if (car.getName().equals("Ford")) {
//                newCars.remove(car);
//            }
//        }

        showElements3(cars);
    }

    private static void treeSetDemo() {
        Car car1 = new Car("Ford", 1990);
        Car car2 = new Car("Nissan", 2001);
        Car car3 = new Car("Lada", 1992);
        Car car4 = new Car("Toyota", 1923);
        Car car5 = new Car("KIA", 1234);
        Car car6 = new Car("KIA", 2001);
        Car car7 = new Car("DODGE", 2130);

        Set<Car> cars = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);

        List<String> list = new ArrayList<>();


        showElements3(cars);
        System.out.println();
//        showElements2(setInteger);
    }

    private static void showElements1(Set<Integer> integerSet) {
        for (Integer e : integerSet) {
            System.out.println(e + "; ");
        }
    }

    private static void showElements2(Set<Integer> integerSet) {
        Iterator<Integer> it = integerSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + "; ");
        }
    }

    private static void showElements3(Set<Car> integerSet) {
        for (Iterator<Car> it = integerSet.iterator(); it.hasNext(); ) {
            Car currentCar = it.next();
            System.out.println(currentCar + "; hashCode = " + currentCar.hashCode());
//            System.out.println(currentCar + "; ");
        }
    }

}
