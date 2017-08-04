package arrays;

import java.util.Arrays;

/**
 * Created by User on 04.08.2017.
 */
public class MultyDimArray {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3, 4},
                {10, 20, 30, 40},
                {100, 200, 300, 400}
        };

        int[][][] arr2 = {
                {
                        {1, 2, 3, 4},
                        {11, 22, 33, 44},
                        {12, 32, 435, 435},
                },
                {
                        {3242, 23432, 777, 65},
                        {534, 453, 234, 234, 543}
                },
                {
                        {324, 563, 543, 43, 43, 54},
                        {3242, 23432, 324, 65},
                        {534, 453, 234, 234, 543}
                }
        };

        int i2 = arr2[1][0][2];
        System.out.println(i2);

        int[][] arr = new int[4][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[(int) (Math.random() * 10 + 1)];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "; ");
            }
            System.out.println();
        }

    }
}
