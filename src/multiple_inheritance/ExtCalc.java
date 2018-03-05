package multiple_inheritance;

public class ExtCalc {
    private int a;
    private int b;

    public ExtCalc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int mul() {
        return a * b;
    }

    public int div() {
        return a / b;
    }

    public int power() {
        return b * b;
    }
}
