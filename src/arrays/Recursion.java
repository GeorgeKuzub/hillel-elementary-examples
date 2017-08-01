package arrays;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fibonachi(5));

        System.out.println(factorial(4));
        System.out.println(factorial(4));
    }

    static int fibonachi(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

    static int factorial(int x) {

        if (x == 1) {

            return 1;
        } else {

            return x * factorial(x - 1);
        }
    }

    static int cycleWayFactorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
