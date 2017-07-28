package intro;

public class FirstClass {
    public static void main(String[] args) {
        /* Multiline Simple comment*/
        // Single simple comment
        int birthYear = 1981;
        int age = 2017 - birthYear;

        String myMessage = "Hello, " + "world! I'm " + age;
        System.out.println(myMessage);

        long years = 2017L;
        long days = 365;
        long hours = 24;
        long seconds = 3600;
        long millis = 1000;

        long millisecondsFromBC = years * days * hours * seconds * millis;
        int intYears = (int) years;
        millisecondsFromBC = (long) (years * days) * hours * seconds * millis;
        System.out.println(millisecondsFromBC);
    }
}
