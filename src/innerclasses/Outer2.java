package innerclasses;

public class Outer2 {
    private Outer.HelloWorld someWayToSayHello;

    public void demoOuterInner() {
        someWayToSayHello = anonymous();
    }

    private Outer.HelloWorld anonymous() {
        return new Outer.HelloWorld() {
            @Override
            public void greet() {
                System.out.println("Chao!");
            }
        };
    }

    public void say() {
        someWayToSayHello.greet();
    }
}
