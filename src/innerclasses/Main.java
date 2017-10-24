package innerclasses;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // The Inner class instantiates inside the Outer class.
        // and getInnerInst() is just a getter that return instance of Inner class.
        Outer.Inner innerInstance = outer.getInnerInst();

        outer.anonymous2();
        outer.anonymous();
        new Outer2().say();

        /* What to do, if you're going to use internal class separately  from outer class? */

          // It doesn't work since default constructor waits the reference to outer object (parent)
        // so it's impossible to do in this way!
          //Outer.Inner innerClass1 = new Outer.Inner();


        // if you need to make only instance of inner class you have to have already instantiated
        // reference to outer class.
        // In this case the reference to Outer object will be passed to the constructor of Inner obj implicitly(!).
        Outer outer1 = new Outer();
        Outer.Inner inner = outer1.new Inner();
        inner.someLocalMethod();

        // But you have a choice to make it more clearly without the need to create an outer class.
        // You may use the nested classes separate from his parent (outer) class
        // Important: do not forget that you lose the reference between inner class and outer (Outer.this)
        // Outer.Inner someInner = new Outer.Inner();

    }
}
