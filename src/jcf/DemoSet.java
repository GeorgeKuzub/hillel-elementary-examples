package jcf;

import java.util.*;

public class DemoSet {
    public static void main(String[] args) {
        treeSetDemo();
//        hashSetDemo();
//        hashSetCarDemo();


//        hashSetCarDemo();
    }

    private static void hashSetCarDemo() {
        Car car1 = new Car("Ford");
        Car car2 = new Car("Nissan");
        Car car3 = new Car("Lada");
        Car car4 = new Car("Toyota");
        Car car5 = new Car("KIA");
        Car car6 = new Car("KIA");
        Car car7 = new Car("DODGE");

        Set<Car> cars = new LinkedHashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);

        Set<Car> newCars = new HashSet<>(cars);
        showElements3(newCars);


        Iterator<Car> iter = newCars.iterator();
        newCars.remove(car2); // Illegal, do not do as that
        while (iter.hasNext()) {
            Car currentCar = iter.next();
            if (currentCar.equals(car3)) {
                iter.remove();
            }
        }


        // Do not do it
//        for (Car car: newCars) {
//            if (car.getModel().equals("Ford")) {
//                newCars.remove(car);
//            }
//        }

        System.out.println();
        showElements3(newCars);
    }

    private static void treeSetDemo() {
        Car car1 = new Car("Ford");
        Car car2 = new Car("Nissan");
        Car car3 = new Car("Lada");
        Car car4 = new Car("Toyota");
        Car car5 = new Car("KIA");
        Car car6 = new Car("KIA");
        Car car7 = new Car("DODGE");

        Set<Car> cars = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        });

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);



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
//            System.out.println(currentCar + "; hashCode = " + currentCar.hashCode());
            System.out.println(currentCar + "; ");
        }
    }

}
