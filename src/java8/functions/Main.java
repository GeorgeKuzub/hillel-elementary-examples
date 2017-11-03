package java8.functions;


public class Main {
    public static void main(String[] args) {

        Converter<String, Integer> converterIntegerToString = String::valueOf;

//        Converter<String, Integer> converter1 = new Converter<String, Integer>() {
//            @Override
//            public String convert(Integer from) {
//                return  String.valueOf(from);
//            }
//
//        };

        String str = converterIntegerToString.convert(100);


//        Converter<String, Integer> converter2 = new Converter<String, Integer>() {
//            @Override
//            public String convert(Integer from) {
//                return String.valueOf(from);
//            }
//        };


    }
}
