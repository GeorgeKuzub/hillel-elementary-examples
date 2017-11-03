package java8.optional;

import java.util.Optional;

public class AppDemo {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        Optional<String> s1 = Optional.of("ds");

        s1.ifPresent(System.out::println);
        if (s1.isPresent()) {
            String s2 = s1.get();
        }

        Optional<String> someExternalObj = empty;

        String s3 = someExternalObj.orElse("Safe NULL");
        System.out.println(s3);

        someExternalObj.orElseThrow(() -> new RuntimeException("Wrong!"));
    }
}
