package oop.intro;

import oop.composition.Car;
import oop.composition.Driver;

public class MyProgramm {

    public static void main(String[] args) {
        User user1 = new User(1, "Иванов Иван Иваныч");
        User user2 = new User(1, "Иванов Иван Иваныч");

        boolean result1 =  (user1 == user2);


        Car car = new Car(new Driver("Petya"));

        boolean result2 = user1.equals(car);



        System.out.println(result2);


    }
}
