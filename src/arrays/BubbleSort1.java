package arrays;

public class BubbleSort1 {

    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 7, 5 ,1, 4, 9};
        bubbleSort(arr);
        printArray(arr);
    }

    public static void bubbleSort(int[] items) {
        int len = items.length;
        for (int j = 0; j < len; j++) {
            int left, right;
            for (int i = 1; i < len - j; i++) {

                left = i - 1;
                right = i;
                if (items[right] < items[left]) {
                    swap(items, left, right);
                }
            }
        }

    }

    private static void swap(int[] arr, int leftIndex,
                             int rightIndex) {
        int tmp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = tmp;
    }


    public static void printArray(int[] a) {
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
