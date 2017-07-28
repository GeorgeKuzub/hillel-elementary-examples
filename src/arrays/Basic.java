package arrays;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {

        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;

        System.out.println(nums[3]);


        // Different ways of declarations:
        int[] nums2 = new int[]{1, 2, 3, 5};
        int[] nums3 = {1, 2, 3, 5};

        // n-dimension arrays
        int[] nums4 = new int[]{0, 1, 2, 3, 4, 5};
        int[][] nums5 = {{0, 1, 2}, {3, 4, 5}};

        // Set the val of element of 1st column of second row
        nums5[1][0] = 44;
        System.out.println(nums5[1][0]);

        // Зубчатые массивы
        //TODO: check how to say in English
        int[][] nums7 = new int[3][];
        nums7[0] = new int[2];
        nums7[1] = new int[3];
        nums7[2] = new int[5];

        // Foreach demo
        int[] myArray = new int[]{1, 2, 3, 4, 5};
        for (int i : myArray) {
            System.out.println(i);
        }

        // old school style to do the same instead foreach
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        // Assign operations:
        int[] numbers = new int[]{1, 2, 3, 5};
        int[] figures = numbers;
        figures[2] = 30;
        System.out.println(numbers[2]); //  30

        // Copying
        int[] myNumbers = new int[]{1, 2, 3, 5};
        int[] myFigures = Arrays.copyOf(numbers, numbers.length);

        figures[2] = 30;
        System.out.println(numbers[2]); // equals 3

        //Sorting
        int[] unOrdered = new int[]{1, 7, 3, 5, 2, 6, 4};

        Arrays.sort(unOrdered);
        for (int i = 0; i < unOrdered.length; i++)
            System.out.println(unOrdered[i]);
    }


}
