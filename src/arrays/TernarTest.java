package arrays;

/**
 * Created by User on 04.08.2017.
 */
public class TernarTest {

    public static void main(String[] args) {
        double d1 = 0.5;
        double d2 = 0.45;
        System.out.println(getDoAction(d1, d2));
    }

    private static String meth1() {
        return "d1 >= d2";
    }

    private static String meth2() {
        return " d1 < d2";
    }

    private static String getDoAction(double d1, double d2) {
        return (d1 >= d2 ? meth1() : meth2());
    }
}
