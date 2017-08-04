package arrays;

import java.util.Arrays;

/**
 * Created by User on 04.08.2017.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 3, 9, 0};

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    int old = arr[i];
                    arr[i] = arr[j];
                    arr[j] = old;
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
