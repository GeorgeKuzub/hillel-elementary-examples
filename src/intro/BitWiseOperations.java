package intro;

public class BitWiseOperations {

    public static void main(String[] args) {
        // Logical AND
        int a1 = 2; //0010
        int b1 = 5; //0101
        System.out.println(a1 & b1); // result is 0

        int a2 = 4; //0100
        int b2 = 5; //0101
        System.out.println(a2 & b2); // result is 4

        // Logical OR
        int a3 = 2; //0010
        int b3 = 5; //0101
        System.out.println(a3 | b3); // result is 7

        int a4 = 4; //0100
        int b4 = 5; //0101
        System.out.println(a4 | b4); // result is 5

        // Logical NOT
        int a5 = 0;
        System.out.println(~a5); // result -1

        // Logical XOR - often uses for simple encryption - :
        int number = 45; // 1001 Value to be encrypted (bin: 101101)
        int key = 102; //Key (bin: 1100110)
        int encrypt = number ^ key; //Result is 1001011 or 75 in dec form
        System.out.println("Encrypted value: " + encrypt);

        int decrypt = encrypt ^ key; // Result will be as original value: 45
        System.out.println("Decrypted value: " + decrypt);

        // Shifting operations:
        int i = 0b10000000_00000000_00000000_00000000; // it's an equivalent of the negative -2147483648
        System.out.println(i);

        int shiftRightWithoutSign = i >>> 1; // Now it equals to ‭(bin)01000000000000000000000000000000‬ or ‭(dec)1073741824‬
        // The sign was lost (the original number became  positive)
        // and number has been divided on two
        System.out.println("Result of shifting not considering the highest bit = "
                + shiftRightWithoutSign);


        int shiftRightWithSign = i >> 1; // Now it equals to ‭(bin)11000000000000000000000000000000‬ or ‭(dec) -1073741824‬
        // The sign wasn't lost (the original number remain negative)
        // but number has been divided on two
        System.out.println("Result of shifting remain the highest bit (sign of a number)= "
                + shiftRightWithSign);
    }

}
