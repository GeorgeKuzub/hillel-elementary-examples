package arrays;

import java.util.Arrays;

/**
 * Created by User on 04.08.2017.
 */
public class ReversiveArray {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 9, 5, 6, 32};
        System.out.println(Arrays.toString(arr));

        for (int i = 0, j = arr.length - 1; i < arr.length >> 1; i++, j--) {
            swap(arr, i, j);
        }

        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] a, int l, int r) {
        int tmp = a[l];
        a[l] = a[r];
        a[r] = tmp;
    }
}
