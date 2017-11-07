package java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamRunner {
    private static void asExample() {
        IntStream.range(0, 10).asLongStream().boxed();
    }

    private static void averageExample() {
        IntStream.range(0, 10).average().ifPresent(System.out::println);
    }

    private static void rangeExample() {
        // rangeClosed & range
        Person person1 = new Person("John", "Doe", 35);
        Person person2 = new Person("Maria", "Doe", 24);
        Person person3 = new Person("Eugene", "Pavlenskiy", 28);
        Person person4 = new Person("George", "Kour", 120);

        List<Person> people = Arrays.asList(person1, person2, person3, person4);

        IntStream.iterate(0, x -> x + 2).limit(people.size() / 2).forEach(i -> {
            System.out.println(people.get(i).getName());
        });

        IntStream.range(0, people.size()).forEach(i -> {
            System.out.println(people.get(i).getName());
        });
    }

    private static void mapToObjExample() {
        IntStream.range(0, 10)
                .mapToObj(String::valueOf)
                .forEach(System.out::println);


    }

    private static void summaryStatisticsExample() {
        IntSummaryStatistics statistics = IntStream.range(0, 100).summaryStatistics();
//        statistics.applyPrint(5000);
        System.out.println(statistics.getAverage());
    }

    public static void main(String[] args) {
//        summaryStatisticsExample();
        averageExample();
    }
}
