package EnumDemo;

import java.util.Scanner;

public class DaysDemo {
    public static void main(String[] args) {
        Days mon = Days.MON;

        System.out.println("Input your number day");


        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        Days yourChoice = null;

        switch (input) {
            case 1:
                yourChoice = Days.MON;
                break;
            case 2:
                yourChoice = Days.TUE;
                break;
            default:
                System.out.println("Other days");
                return;
        }

        System.out.println(yourChoice);
    }
}
