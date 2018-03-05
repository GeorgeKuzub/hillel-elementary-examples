package oop.intro;

public class ExtendCalc extends BaseCalc {
    private int a, b;

    public ExtendCalc(int a, int b) {
        super(a, b);
        this.a = a;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int sub(int a, int b) {
        return a - b;
    }


    @Override
    public long pow() {
        return a * a * a;
    }

    public long normalPow() {
        return super.pow();
    }

}
