package exceptions;

import java.io.IOException;

public class NestedExceptions {

    public static void exceptionLost() {
        try {
            try {
                throw new Exception("a");
            } finally {
                if (true) {
                    throw new IOException("b");
                }
                System.err.println("c");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("d");
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        exceptionLost();
    }

}
