package recurrent;

/**
 * Created by User on 08.08.2017.
 */
public class SumFibonachi {
    public static void main(String[] args) {
        int sumFibonacci = 0;
        int numbers[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0 || i == 1) {
                numbers[i] = 1;
            } else {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }
            sumFibonacci += numbers[i];
        }
        System.out.println(sumFibonacci);
    }
}
