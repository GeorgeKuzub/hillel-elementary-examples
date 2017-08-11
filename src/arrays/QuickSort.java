package arrays;

import java.util.Arrays;

public class QuickSort {
    public static int[] arr = new int[]{10, 50, 40, 20, 32, 54, 90, -2};

    public static void main(String[] args) {

        System.out.println("The original array before QuickSort:");
        System.out.println(Arrays.toString(arr));

        int first = 0;
        int last = arr.length - 1;
        sort(first, last);

        System.out.println("The sorted array after QuickSort:");
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int first, int last) {
        int l = first;
        int r = last;
        int m = arr[(first + last) / 2];

        do {
            while (arr[l] < m) {
                l++;
            }

            while (arr[r] > m) {
                r--;
            }

            if (l <= r) {
                swap(l, r);
                l++;
                r--;
            }
        } while (l < r);

        if (l < last) {
            sort(l, last);
        }

        if (r > first) {
            sort(first, r);
        }
        ;
    }

    private static void swap(int l, int r) {
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }
}
