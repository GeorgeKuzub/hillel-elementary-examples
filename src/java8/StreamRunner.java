package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamRunner {

    public static boolean allMatchExample() {
        return Arrays.asList(1, 2, 3).stream().allMatch(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                System.out.println("now is " + integer);
                return integer > 1;
            }
        });
    }

    public static boolean anyMatchExample() {
        Integer[] arr = {23, 231, 234, 32, 4, 43};
        return Arrays.stream(arr).anyMatch(e -> e == 366662);
    }

    public static boolean noneMatchExample() {
        return Stream.of(3, 4, 6, 90).noneMatch((Integer x) -> x == 0);
    }

    public static void concatExample() {
        Stream.concat(
                Arrays.stream(new String[]{"hello", "hi"}),
                Stream.of("buy")
        ).forEach(System.out::println);
    }

    public static void countExample() {
        System.out.println(Stream.of("12ff", "vdvd", "fdsf").count());
    }

    public static void distinctExample() {
//        Consumer<String> consumer = System.out::println;
        Stream.of("hello", "hi", "hi").distinct().forEach(s);
    }

    public static void filterExample() {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        Stream.concat(
                Arrays.stream(new String[]{"hello", "hi"}),
                Stream.of("buy")
        ).filter(x -> !x.startsWith("h")).forEach(consumer);
    }

    public static void findAnyExample() {
        Stream.of(3, 3, 4, 6, 90)
                .filter(x -> x == 3)
                .findAny()
                .ifPresent(System.out::println);
    }

    public static void flatMapExample() {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("jj", "dsfdsf", "dddd"),
                Arrays.asList("jj2", "ndsbvdbshdbsj", "ddddggg")
        );
        list.stream().flatMap(l -> l.stream()).forEach(System.out::println);
    }

    public static void forEachOrderedExample() {
        Stream.of(773, 13, 4, 6, 90).forEachOrdered(System.out::println);
    }

    public static void generateExample() {
        Stream.generate(new Random()::nextDouble)
                .limit(10)
                .forEach(System.out::println);
    }

    public static void iterateExample() {
        Stream.iterate(2, x -> x + 1)
                .limit(10)
                .forEach(System.out::println);
    }

    public static void limitExample() {
        Stream.of(1, 2, 3, 1, 2, 3, 3, 1, 2, 3)
                .limit(89)
                .forEach(System.out::println);
    }

    public static void mapExample() {
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Maria", "Doe");
        Person person3 = new Person("Vitaliy", "Tsukerman");

        Stream.of(person1, person2, person3)
                .filter(p -> {
                    System.out.println("filer1: " + p.getName());
                    return p.getSurname().equals("Doe");
                })
                .filter(p -> {
                    System.out.println("filer2: " + p.getName());
                    return p.getName().equals("Maria");
                })
                .map(p -> {
                    System.out.println("map: " + p.getName());
                    return p.getName();
                })
                .forEach(n -> {
                    System.out.println("forEach: " + n);
                });
    }

    public static void maxExample() {
        Stream.of(1, 43, 33, 12, 9)
                .max(Integer::compare)
                .ifPresent(System.out::println);
    }

    public static void minExample() {
        Stream.of(1, 43, 33, 12, 9)
                .min(Integer::compare)
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        intStreamExample();
    }

    public static void peekExample() {
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Maria", "Doe");
        Person person3 = new Person("Vitaliy", "Tsukerman");

        Stream.of(person1, person2, person3)
                .filter(p -> p.getSurname().equals("Doe"))
                .peek(p -> p.setName("New Name"))
                .map(p -> p.getName())
                .forEach(n -> {
                    System.out.println("forEach: " + n);
                });
    }

    public static void intStreamExample() {
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Maria", "Doe");
        Person person3 = new Person("Vitaliy", "Tsukerman");

        Stream.of(person1, person2, person3)
                .mapToInt(p -> p.getSurname().length())
                .forEach(System.out::println);
    }

    static class Person {

        String name;
        String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String getSurname() {
            return surname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}
