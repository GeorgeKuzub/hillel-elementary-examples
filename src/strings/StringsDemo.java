package strings;

public class StringsDemo {

    public static void charAtDemo() {
        System.out.println("charAtDemo:");
        String s = "Strings are immutable";
        char result = s.charAt(8);
        System.out.println(result);
        System.out.println();
    }

    public static void concatDemo() {
        System.out.println("concatDemo:");
        String s = "Strings are immutable";
        s = s.concat(" all the time");
        System.out.println(s);
        System.out.println();
    }


    public static void contentEqualsDemo() {
        System.out.println("contentEqualsDemo:");
        String str1 = "Not immutable";
        String str2 = "Strings are immutable";
        StringBuffer str3 = new StringBuffer("Not immutable");

        boolean result = str1.contentEquals(str3);
        System.out.println(result);

        result = str2.contentEquals(str3);
        System.out.println(result);
        System.out.println();
    }

    public static void copyValueOfDemo() {
        System.out.println("copyValueOfDemo:");
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String Str2 = "";
        Str2 = Str2.copyValueOf(Str1);
        System.out.println("Returned String: " + Str2);
        System.out.println();
    }

    public static void endWithDemo() {
        System.out.println("endWithDemo:");
        String Str = new String("This is really not immutable!!");
        boolean retVal;

        retVal = Str.endsWith("immutable!!");
        System.out.println("Returned Value = " + retVal);

        retVal = Str.endsWith("immu");
        System.out.println("Returned Value = " + retVal);
        System.out.println();
    }

    public static void equalsDemo() {
        System.out.println("equalsDemo:");
        String Str1 = new String("This is really not immutable!!");
        String Str2 = Str1;
        String Str3 = new String("This is really not immutable!!");
        boolean retVal;

        retVal = Str1.equals(Str2);
        System.out.println("Returned Value = " + retVal);

        retVal = Str1.equals(Str3);
        System.out.println("Returned Value = " + retVal);
        System.out.println();
    }

    public static void indexOfDemo1() {
        System.out.println("indexOfDemo1:");
        String Str = new String("Welcome to Hillel");
        System.out.print("Found Index :");
        System.out.println(Str.indexOf('o'));
        System.out.println();
    }

    public static void indexOfDemo2() {
        System.out.println("indexOfDemo2:");
        String Str = new String("Welcome to Hillel");
        String SubStr1 = new String("Tutorials");
        System.out.print("Found Index :");
        System.out.println(Str.indexOf(SubStr1, 15));
        System.out.println();
    }

    public static void lastIndexOfDemo() {
        System.out.println("lastIndexOfDemo:");
        String Str = new String("Welcome to Hillel");
        System.out.print("Found Last Index :");
        System.out.println(Str.lastIndexOf('o'));
        System.out.println();
    }

    public static void lengthDemo() {
        System.out.println("lengthDemo:");
        String Str = new String("Welcome to Hillel");
        System.out.println("The length of the string is: " + Str.length());
        System.out.println();
    }

    public static void replaceDemo() {
        System.out.println("replaceDemo:");
        String Str = new String("Welcome to Hillel");

        System.out.print("Return Value :");
        System.out.println(Str.replace('o', 'T'));

        System.out.print("Return Value :");
        System.out.println(Str.replace('l', 'D'));
        System.out.println();
    }

    public static void startWithDemo1() {
        System.out.println("startWithDemo1:");
        String Str = new String("Welcome to Hillel");

        System.out.print("Return Value :");
        System.out.println(Str.startsWith("Welcome"));

        System.out.print("Return Value :");
        System.out.println(Str.startsWith("Tutorials"));
        System.out.println();
    }

    public static void startWithDemo2() {
        System.out.println("startWithDemo2:");
        String Str = new String("Welcome to Hillel");

        System.out.print("Return Value :");
        System.out.println(Str.startsWith("Tutorials", 11));
        System.out.println();
    }

    public static void substringDemo1() {
        System.out.println("substringDemo1:");
        String Str = new String("Welcome to Hillel");

        System.out.print("Return Value :");
        System.out.println(Str.substring(10));
        System.out.println();
    }


    public static void subStringDemo2() {
        System.out.println("subStringDemo2:");
        String Str = new String("Welcome to Hillel");

        System.out.print("Return Value :");
        System.out.println(Str.substring(10, 15));
        System.out.println();
    }

    public static void toCharArrayDemo() {
        System.out.println("toCharArrayDemo:");
        String Str = new String("Welcome to Hillel");

        System.out.print("Return Value :");
        System.out.println(Str.toCharArray());
        System.out.println();
    }

    public static void toLowerCaseDemo() {
        System.out.println("toLowerCaseDemo:");
        String Str = new String("Welcome to Hillel");

        System.out.print("Return Value :");
        System.out.println(Str.toLowerCase());
        System.out.println();
    }

    public static void toUpperCaseDemo() {
        System.out.println("toUpperCaseDemo:");
        String Str = new String("Welcome to Hillel");


        System.out.print("Return Value :");
        System.out.println(Str.toUpperCase());
        System.out.println();
    }

    public static void trimDemo() {
        System.out.println("trimDemo:");
        String Str = new String("   Welcome to Hillel   ");

        System.out.print("Return Value :");
        System.out.println(Str.trim());
        System.out.println();
    }

    public static void valueOfDemo() {
        System.out.println("valueOfDemo:");
        double d = 102939939.939;
        boolean b = true;
        long l = 1232874;
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        System.out.println("Return Value : " + String.valueOf(d));
        System.out.println("Return Value : " + String.valueOf(b));
        System.out.println("Return Value : " + String.valueOf(l));
        System.out.println("Return Value : " + String.valueOf(arr));

        System.out.println();
    }

    public static void main(String[] args) {
        charAtDemo();
        concatDemo();
        contentEqualsDemo();
        copyValueOfDemo();
        endWithDemo();
        equalsDemo();
        indexOfDemo1();
        indexOfDemo2();
        lastIndexOfDemo();
        lengthDemo();
        replaceDemo();
        startWithDemo1();
        startWithDemo2();
        substringDemo1();
        subStringDemo2();
        toCharArrayDemo();
        toLowerCaseDemo();
        toUpperCaseDemo();
        trimDemo();
        valueOfDemo();
    }
}