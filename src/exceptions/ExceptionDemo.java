package exceptions;

public class ExceptionDemo {

    void process(String str) {

        try {
            System.out.println("Init part of this program");
            int i = Integer.parseInt(str); // if exception to be thrown then code below won't be done.
            System.out.println("unreachable code here in case of an raising exception over.");
        } catch (NumberFormatException e) {
            System.err.println("Format exception problem");
            e.printStackTrace();
            System.exit(-1);
            throw new RuntimeException("Runtime ex.");
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal argumets");
            e.printStackTrace();
        } catch (RuntimeException re) {
            System.err.println("Runtime exceptions");
        } finally {
            return;
        }
    }


    public static void main(String[] args) {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        exceptionDemo.process("");
    }


}
