package java8.functions;

import oop.polymorphism.shop.enums.ConsultResult;

public class Main {
    public static void main(String[] args) {

        Converter<String, Integer> converter1 = String::valueOf;
        String str = converter1.convert(100);


//        Converter<String, Integer> converter2 = new Converter<String, Integer>() {
//            @Override
//            public String convert(Integer from) {
//                return String.valueOf(from);
//            }
//        };


    }
}
