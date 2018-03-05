package overridingstatic;

public class Main {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassA b = new ClassB();
        ClassA c = new ClassC();

        a.doAction(a);
        b.doAction(b);
        c.doAction(c);
    }

}
