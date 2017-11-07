package java8.optional;

import java8.Person;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class OptionalDemo {
    public static void main(String[] args) {

        MyFuncPrintInt myFuncPrintInt = s -> {
            System.out.print(s + "; ");
        };
        System.out.println();

        for (int i = 0; i < 10; i++) {
            myFuncPrintInt.applyPrint(i);
        }

        Consumer<String> myPrintRowFunc = x -> System.out.print(x + "; ");
        Stream.of("ABC", "ADC", "ABC").forEach(myPrintRowFunc);
        Person pJhon1 = new Person("Jhon", "Doe", 22);
        System.out.println();
        Optional<Person> optionalJohn = Optional.of(pJhon1);
        optionalJohn.ifPresent(System.out::println); //System.out.println(optionalJohn.get());
        optionalJohn.orElseThrow(() -> new RuntimeException("Wrong!"));
        optionalJohn.orElseGet(() -> new Person("Jack", "Jason", 100));
        Optional<Person> optionalAdam = Optional.of(new Person("Adam", "Doe", 10));

        Optional<Integer> anyNumber = Stream.of(1, 2, 3).findAny();
        System.out.println(anyNumber.get());

        System.out.println();
        IntStream.range(0, 5).mapToObj(i -> "a" + i).forEach(System.out::println);

        System.out.println();
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.print("filter: " + s + "; ");
                    return true;
                }).forEach(System.out::println);

        Consumer<Person> myPrintRowFuncForPersons = x -> System.out.print(x + "!!!!!!");
        optionalJohn.ifPresent(myPrintRowFuncForPersons);

        Optional<Person> personNata = Optional.ofNullable(null);

        Person substitute = personNata.orElse(new Person("Lena", "SOkolova", 18));

        System.out.println("\n" + substitute.getName() + "is a substitute of Nata");
    }
}