package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamRunner2 {

    private static void builderExample() {
        Stream.builder().add(1).add(2).add(4).build().forEach(x -> System.out.println(x));

    }

    private static void skipExample() {
        Arrays.asList("John", "Maria", "Eugene", "Elena").stream()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);
    }

    private static void sortedExample() {
        Arrays.asList("John", "Maria", "Eugene", "Elena").stream()
                .sorted((o1, o2) -> -2)
                .forEach(System.out::println);
    }

    private static void toArrayExample() {
        List<String> list = Arrays.asList("John", "Maria", "Eugene", "Elena");
        Object[] objects = list.stream().toArray();
        String[] strings1 = new String[4];
        String[] strings = list.stream().toArray(StreamRunner2::create);
        System.out.println(String.join(",", strings));
    }

    private static String[] create(int size) {
        return new String[size];
    }

    public static void main(String[] args) {
        builderExample();
    }
}
