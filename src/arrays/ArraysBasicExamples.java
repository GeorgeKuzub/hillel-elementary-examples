package arrays;

/**
 * Created by User on 01.08.2017.
 */
public class ArraysBasicExamples {

    public static void main(String[] args) {
        double[] dArr = new double[]{10, 2, 4, 11};
        double min = getMinElement(dArr);
        System.out.println("Min element is: " + min);
    }

    public static double getMinElement(double[] arr) {
        double minElem = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < minElem) {
                minElem = arr[i];
            }
        }
        return minElem;
    }
}
