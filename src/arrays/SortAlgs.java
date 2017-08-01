package arrays;

public class SortAlgs {
    public static void main(String[] args) {
        int[] arr1 = generateRandomArray();
        bubbleSort(arr1);
        printToConsole(arr1);

        int[] arr2 = generateRandomArray();
        selectionSort(arr2);
        printToConsole(arr2);

    }

    public static void printToConsole(int[] arr) {
        for (int element : arr) {
            System.out.print(element + "; ");
        }
        System.out.println();
    }


    public static int[] generateRandomArray() {
        final int dimension = 10;
        int[] result = new int[dimension];

        for (int i = 0; i < dimension; i++) {
            result[i] = (int) (Math.random() * 99 + 1);
        }

        return result;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap the elements
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            // get the current smallest element
            int min = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            //put the smallest element to the sorted list
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }
}
