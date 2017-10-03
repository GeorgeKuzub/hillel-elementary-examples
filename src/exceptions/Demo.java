package exceptions;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Result is = " + callDemo("5"));
    }

    public static Integer callDemo(String sNumber) {
        try {
            System.out.println("Inside try block");
            return Integer.parseInt(sNumber);
        } catch (Exception e) {
            System.out.println("Inside catch block");
            return -1;
        } finally {
            System.out.println("Inside finally block");
            return 0;
        }
    }
}
