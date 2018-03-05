package multiple_inheritance;

public class BaseCalc {
    private int a;
    private int b;

    public BaseCalc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int sub() {
        return a - b;
    }

    public int power() {
        return a * a;
    }
}
