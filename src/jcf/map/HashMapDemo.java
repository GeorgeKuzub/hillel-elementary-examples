package jcf.map;

import jcf.Car;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {


    public static void main(String[] args) {
        Map<Car, String> mapCars = new HashMap<>();

        Car car1 = new Car("Ford", 1990);
        Car car2 = new Car("Nissan", 2001);
        Car car3 = new Car("Lada", 1992);
        Car car4 = new Car("Toyota", 1923);
        Car car5 = new Car("KIA", 1234);
        Car car6 = new Car("KIA", 2001);
        Car car7 = new Car("DODGE", 2130);

        mapCars.put(car1, "Super  car - Ford 1990");
        mapCars.put(car2, "Super  car - Nissan 2001");
        mapCars.put(car3, "Super  car - Lada 1992");
        mapCars.put(car4, "Super  car - Toyota 1923");
        mapCars.put(car5, "Super  car - KIA 1234");
        mapCars.put(car6, "Super  car - KIA 2001");
        mapCars.put(car7, "Super  car - DODGE 2130");


        for (Map.Entry<Car, String> entry : mapCars.entrySet()) {
            entry.setValue(entry.getValue()+"_");
        }

        for (String el : mapCars.values()) {
            System.out.println(el);
        }


    }
}
