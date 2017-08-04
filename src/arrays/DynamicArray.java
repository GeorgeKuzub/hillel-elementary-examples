package arrays;

public class DynamicArray {
    public static int max_elements = 5;
    public static int[] array = new int[max_elements];
    public static int current_index = 0;

    public static void main(String[] args) {

        add(1);
        add(2);
        add(3);
        add(4);
        add(5);

        add(6); // Creation a new array
        add(7);
        add(8);
        add(9);
        add(10);

        DynamicArray.add(11); // Creation a new array
        DynamicArray.add(12);
        DynamicArray.add(13);
        DynamicArray.add(14);
        DynamicArray.add(15);
        DynamicArray.add(16);
        DynamicArray.add(17);
        DynamicArray.add(18);
        DynamicArray.add(19);
        DynamicArray.add(20);

        DynamicArray.add(21); // And again the same action


        showAllElements();

        System.out.println("The 11th elements equals to: " + DynamicArray.get(10));
        System.out.println();

        System.out.println(DynamicArray.get(-1));

    }

    public static void add(int num) {
        array[current_index] = num;
        current_index++;
        if (current_index > max_elements - 1) {
            copyArrays(array);
        }
    }

    public static int get(int index) {
        if ((index < 0) || (index > max_elements)) {
            System.out.println("The index: " + index + " doesn't exist.");
            System.out.println("Out Of Index Boundary Situation: please, check again the input index");
            System.exit(-1);
        }
        return array[index];
    }

    public static void copyArrays(int[] srcArray) {
        int newLimitMaxElements = max_elements * 2;
        int[] newArray = new int[newLimitMaxElements];
        System.arraycopy(srcArray, 0, newArray, 0, max_elements);
        max_elements = newLimitMaxElements;
        array = newArray;
    }

    public static void showAllElements() {
        for (int el : array) {
            System.out.print(el + "; ");
        }
        System.out.println();
    }

}
