package arrays;

import java.util.Random;

/**
 * Created by User on 01.08.2017.
 */
public class TestRandom {


    private static int[] arr1 = {1, 2, 3};

    public static void main(String[] args) {

        getChangeVal(arr1);
        System.out.println(arr1[2]);
    }

    private static void getChangeVal(int[] arr) {

        arr[2] = 100;
        System.out.println(arr[2]);
    }


}
