package recurrent;

/**
 * Created by User on 08.08.2017.
 */
public class Fibonacci2 {
    public static void main(String[] args) {
        int prevPrev = 1;
        int prev = 1;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = prev + prevPrev;
            prevPrev = prev;
            prev = sum;
        }
        System.out.println(sum);

    }
}