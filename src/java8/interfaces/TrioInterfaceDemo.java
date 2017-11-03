package java8.interfaces;

public class TrioInterfaceDemo {

    public static void main(String[] args) {

        TrioInterface<Integer, Character, Double, String> complexFunc =
                (t1, t2, k, v) -> {
                    return new String("Succuess");
                };

        String result = complexFunc.test(100, 200, 'Y', 0.1D);

    }



}
