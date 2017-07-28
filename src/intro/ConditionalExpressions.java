package intro;

public class ConditionalExpressions {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 4;
        if (num1 > num2) {
            System.out.println("First is more than second");
        }

        int num3 = 6;
        int num4 = 4;
        if (num3 > num4) {
            System.out.println("First is more than second");
        } else {
            System.out.println("First is less than second");
        }

        int num5 = 6;
        int num6 = 8;
        if (num5 > num6) {
            System.out.println("First is more than second");
        } else if (num5 < num6) {
            System.out.println("First is less than second");
        } else {
            System.out.println("First and second are equal");
        }


        int num7 = 8;
        int num8 = 6;
        if (num7 > num8 && num7 > 7) {
            System.out.println("First is more than second and more than '7' ");
        }

        // Switch case:

        int num = 8;
        switch (num) {

            case 1:
                System.out.println("num == 1");
                break;

            case 8:
                System.out.println("num == 8");
                num++;
                break;

            case 9:
                System.out.println("num == 9");
                break;

            default:
                System.out.println("Num doesn't equal to 1, 8, 9");
        }

        // Ternary expression

        int x = 5;
        int y = 3;
        int z = x < y ? (x + y) : (x - y);
        System.out.println(z);
    }
}
