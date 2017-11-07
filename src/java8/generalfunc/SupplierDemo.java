package java8.generalfunc;

import java8.Person;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<Person> userFactory = () -> {

            Scanner in = new Scanner(System.in);
            System.out.println("Input name: ");
            String name = in.nextLine();
            return new Person(name, "Gavrilov", 10);
        };

        Person person1 = userFactory.get();
        Person person2 = userFactory.get();

        System.out.println("Имя user1: " + person1.getName());
        System.out.println("Имя user2: " + person2.getName());
    }
}
