package oop.intro;

import java.util.ListIterator;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        System.out.println("Count objects LittleCat before creating" +
                        "cats: " +
                LittleCat.getCount());

        for (int i = 0; i < new Random().nextInt(20); i++) {
            new LittleCat("Boris" + i, 10);
        }

        System.out.println("Count objects LittleCat after creating" +
                "cats: " +
                LittleCat.getCount());


//        LittleCat cat1 = new LittleCat("Borka");

//        LittleCat cat2 = new LittleCat();

//        System.out.println(cat1.getName());
//        System.out.println(cat1.getAge());

//        Cat cat = new Cat();
//        Bird bird = new Bird();
//        Dog dog = new Dog();
//
//        Pet[] pets = new Pet[] {cat, dog, bird};
//        for (Pet myLovePet : pets) {
//            myLovePet.move();
//        }

        // dog.bark(); // we can't run the private method from another classes

    }
}
