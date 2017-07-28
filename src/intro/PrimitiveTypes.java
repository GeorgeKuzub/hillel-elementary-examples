package intro;


public class PrimitiveTypes {

    public static void main(String[] args) {
        // Primitive types
        byte bMinVal = -128;
        byte bMaxVal = 127;

        short sMinVal = -32768;
        short sMaxVal = 32767;

        int iMin = -2_147_483_648;
        int iMax = 2_147_483_647;

        long lMin = -9223372036854775808L;
        long lMax = 9223372036854775807L;

        float fMin = 0x0.000002P-126f; // // 1.4e-45f
        float fMax = 0x1.fffffeP+127f; // 3.4028235e+38f

        double dMin = 0x0.0000000000001P-1022; // 4.9e-324
        double dMax = 0x1.fffffffffffffP+1023; // 1.7976931348623157e+308

        char cVar1 = 'A'; // It corresponds to the code 65
        char cVar2 = 65; // it's the same as 'A' symbol
        char cMaxValue = 6500;
        char tab = '\t'; // a special literal that means a tabulation symbol
        char newLine = '\n'; // a special literal that means a new line
        char cAnotherChar = '\u004D'; // It corresponds to 'M' symbol


        //Different Numeral Systems
        int num111 = 0x6F; // 16-hex system, number 111
        int num8 = 010; // 8-oct system, number 8
        int num13 = 0b1101; // bin-system , num 13

        /* Casting operation: */
        // Explicitly:
        int a1 = 201;
        byte b1 = (byte) a1;

        // Implicitly
        byte b2 = 126;
        int a2 = b2;

        // Casting under mixing types and operations
        byte a3 = 7;
        short b3 = 5;
        byte c3 = (byte) (a3 + b3);

        int a4 = 8;
        double b4 = 2.7;
        double c4 = a4 + b4;


    }

}
