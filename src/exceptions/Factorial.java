package exceptions;

public class Factorial {
    public static void main(String[] args) {
        try {
            getFactorial(-1);
        } catch (FactorialException e) {
            e.printStackTrace();
        }

    }

    public static int getFactorial(int num) throws FactorialException {

        int result = 1;
        if (num < 1) throw new FactorialException("Число не может быть меньше 1", num);

        for (int i = 1; i <= num; i++) {

            result *= i;
        }
        return result;
    }
}
