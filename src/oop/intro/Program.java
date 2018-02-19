package oop.intro;

public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bird bird = new Bird();
        Dog dog = new Dog();
        Pet[] pets = new Pet[] {cat, dog, bird};
        for (Pet myLovePet : pets) {
            myLovePet.move();
        }

        // dog.bark(); // we can't run the private method from another classes

    }
}
