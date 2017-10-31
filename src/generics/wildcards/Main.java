package generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listAnimals = new ArrayList<>();
        listAnimals.add(new Animal(1));
        listAnimals.add(new Animal(2));
        listAnimals.add(new Animal(3));
        System.out.println("All animals have IDs below: ");
        printOnlyAnimalCollection(listAnimals);

        List<Dog> listDogs = new ArrayList<>();
        listDogs.add(new Dog());
        listDogs.add(new Dog());
        // printOnlyAnimalCollection(listDogs); -> we can't do it

        // It works, but it's not general way! We had to write specific
        // method "printOnlyDogCollection" and we can't use it for Animal collection
        printOnlyDogCollection(listDogs);

        printCollectionGeneral1(listDogs);
        printCollectionGeneral1(listAnimals);

        printCollectionGeneral2(listDogs);
        printCollectionGeneral2(listAnimals);

        List<SmallDogs> listSmallDogs = new ArrayList<>();
        listSmallDogs.add(new SmallDogs());
        listSmallDogs.add(new SmallDogs());
        listSmallDogs.add(new SmallDogs());

        // printAllExceptSmallDogs(listSmallDogs); you can't do it since there's restriction super
        printAllExceptSmallDogs(listDogs); // It works since it fit super restriction for DOGS and above classes
    }

    public static void printOnlyAnimalCollection(List<Animal> list) {
        for (Animal a : list) {
            System.out.println(a);
        }
    }

    // Not general way!
    public static void printOnlyDogCollection(List<Dog> list) {
        for (Dog a : list) {
            System.out.println(a);
        }
    }

    // General approaches:
    // Wildcards demo bellow

    // 1st approach to make printAllExceptSmallDogs animal collection more General
    public static void printCollectionGeneral1(List<? extends Animal> list) {
        for (Animal a : list) {
            System.out.println(a.getId());
        }
    }

    // 2nd approach to make printAllExceptSmallDogs animal collection more General - Generic way
    public static <E extends Animal> void printCollectionGeneral2(List<E> animalsList) {
        for (E a : animalsList) {
            System.out.println(a.getId());
        }
    }


    public static void printAllExceptSmallDogs(List<? super Dog> list) {
        for (Object d : list) {
            Animal a = (Animal) d;
            System.out.println(a.getId());
        }
    }

}
