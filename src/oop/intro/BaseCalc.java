package oop.intro;

public class BaseCalc {
    private int a;
    private int b;


    public BaseCalc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public long pow() {
        return a * a;
    }

    public int add() {
        return a + b;
    }

    public int mul() {
        return a * b;
    }
}
