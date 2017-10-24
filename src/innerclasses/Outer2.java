package innerclasses;

public class Outer2 {

    void demoOuterInner() {

    }

    void anonymous() {
        Outer.HelloWorld greeting = new Outer.HelloWorld() {
            @Override
            public void greet() {
                System.out.println("Hello World");
            }
        };
    }
}
