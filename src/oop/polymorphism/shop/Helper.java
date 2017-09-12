package oop.polymorphism.shop;

import static java.lang.Math.random;

public class Helper {
    public static boolean getChoice() {
        final double factor = 0.5;
        return (random() > factor ? false : true);
    }
}
