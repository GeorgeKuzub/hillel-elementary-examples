package recurrent;

/**
 * Created by User on 08.08.2017.
 */
public class Factorial {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Factorial is :" +
                fact(n));
    }

    private static long fact(int n) {
        long result = 1;
        if (n == 1) {
            return 1;
        }

        result = n * fact(n - 1);
        return result;
    }
}
