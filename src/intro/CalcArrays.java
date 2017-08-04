package intro;

/**
 * Created by User on 01.08.2017.
 */
public class CalcArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {10, 20, 30};

        if (args.length == 0) {
            System.out.println("I can't calc your arrays");
            System.exit(-1);
        }

        MathArrLib.showArr(arr1);
        MathArrLib.showArr(arr2);

        String arg = args[0];
        int[] result = new int[arr1.length];
        switch (arg) {
            case "add":
                result = MathArrLib.addArr(arr1, arr2);
                break;
            case "sub":
                result = MathArrLib.subArr(arr1, arr2);
                break;
            default:
                System.out.println("You must specify: 'add' or 'sub'");
                break;
        }

        MathArrLib.showArr(result);


    }
}
