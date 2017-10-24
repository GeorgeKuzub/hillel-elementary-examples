package innerclasses;

public class Outer2 {

    void anonymous() {
        Outer.HelloWorld greeting = new Outer.HelloWorld() {
            @Override
            public void greet() {
                System.out.println("Hello World");
            }
        };
    }
}
