package exceptions;

public class NPEDemo {

    public static void main(String[] args) {
        int code = getResult(null);
        System.out.println(code);
    }

    public static int getResult(String s) {
        try {
          return s.hashCode();
        } catch (Exception e) {
            System.out.println("Error and we must return -1");
            return -1;
        } finally {
            return 0;
        }
    }
}
