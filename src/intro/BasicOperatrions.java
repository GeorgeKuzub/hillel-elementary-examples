package intro;

public class BasicOperatrions {
    public static void main(String[] args) {
        // Numbers
        int a1 = 3 + 4; // result equals to 7
        int a2 = 10 - 7; //result equals to 3
        int a3 = 10 * 5; //result equals to 50
        double a4 = 14.0 / 5.0; //result equals to 2.8
        double a5 = 14.0 % 5.0; //result equals to 4
        int b1 = 5;
        int c1 = ++b1; // c1=6; b1=6
        int b2 = 5;
        int c2 = b2++; // c2=5; b2=6
        int b3 = 5;
        int c3 = --b3; // c3=4; b3=4
        int b4 = 5;
        int c4 = b4--; // c4=5; b4=4


        // Strings
        String hello = "Welcome to " + "my world" + "!"; //result equals to "Welcome to my world!"


        // Short form of arithmetic operations for accumulation values
        int b5 = 100;
        int c5 = 0;
        c5 += b5;

        /*
              There are a lot of different variations:
                c-=b;
                c*=b;
                c/=b;
                c%=b;
                c&=b;
                c|=b;
                c^=b;
                c<<=b;
                c>>=b;
                c>>>=b;
                etc.
        * */
    }
}
