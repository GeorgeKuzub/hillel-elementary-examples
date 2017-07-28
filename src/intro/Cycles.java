package intro;

public class Cycles {
    /*

     General template:
        * for ([init section]; [cond. section]; [changing of count]) {
            // actions here
        }
    */

    public static void main(String[] args) {

        for (int i = 1; i < 9; i++) {
            System.out.printf("The power of a number %d equal %d \n", i, i * i);
        }


        // do-while cycle
        int j = 3;
        do {
            System.out.println(j);
            j--;
        }
        while (j > 0); // while it's true the actions will be perform inside cycle. At least one iteration will be done.


        // while cycle
        int k = 5;
        while (k > 0) {
            System.out.println(k);
            k--;
        }

        // continue
        int num = 10;
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                System.out.println("I can't divide a number by zero");
                continue;
            }
            num /= i;
        }


        // break

        for (int i = 10; i < -5; i++) {
            if (i == 0) {
                System.out.println("Stop the program since I can't divide by zero and don't wont to get negative results at all");
                break;
            }
            num /= i;
        }

        // Infinity cycle1
//        while (true) {
//            System.out.println("Infinity cycle");
//        }

//        // Infinity cycle2
//        int i = 1;
//        for (; ; ) {
//            System.out.printf("The power of a number %d equal %d \n", i, i * i);
//        }

    }

}
