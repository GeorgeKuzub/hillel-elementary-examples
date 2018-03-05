package oop.composition;


public class Car {
    private Engine engine = new Engine();
    private Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    public void start(){
        System.out.println("Start my car");
        driver.goAhead();
    };

    public void move(){
        System.out.println("The car is moving");
    };

    public void stop(){
        System.out.println("Stop my car");
    };

};
