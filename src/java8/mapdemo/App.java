package java8.mapdemo;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone_6_S", 54000),
                new Phone("Lumia_950", 45000),
                new Phone("Samsung_Galaxy_S6", 40000),
                new Phone("LG_G_4", 32000));


        Map<String, Integer> phones = phoneStream
                .collect(Collectors.toMap(p -> p.getName(), t -> t.getPrice()));

        phones.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
