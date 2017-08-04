package intro;

/**
 * Created by User on 01.08.2017.
 */
public class MathArrLib {
    public static int[] addArr(int[] a, int[] b) {
        if (a.length != b.length) {
            System.out.println("Error! The length of passed" +
                    "arrays must be the same");
            System.exit(-1);
        }
        int[] result = new int[b.length];

        for (int i = 0; i <= a.length - 1; i++) {
            result[i] = a[i] + b[i];
        }

        return result;
    }

    public static int[] subArr(int[] a, int[] b) {
        if (a.length != b.length) {
            System.out.println("Error! The length of passed" +
                    "arrays must be the same");
            System.exit(-1);
        }
        int[] result = new int[b.length];

        for (int i = 0; i <= a.length - 1; i++) {
            result[i] = a[i] - b[i];
        }

        return result;
    }

    public static void showArr(int[] arr) {
        for (int el : arr) {
            System.out.print(el + "; ");
        }
        System.out.println();
    }
}
