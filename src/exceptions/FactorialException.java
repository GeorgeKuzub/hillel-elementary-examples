package exceptions;

public class FactorialException extends Exception {
    private int number;

    public FactorialException(String message, int num) {
        super(message);
        number = num;
    }

    public int getNumber() {
        return number;
    }
}
