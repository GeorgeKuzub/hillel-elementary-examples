package innerclasses;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner innerInstance = outer.getInnerInst();
        innerInstance.someLocalMethod();

        outer.anonymous2();
        outer.anonymous();

        /* What to do, if you're going to use internal class separately  from outer class? */

          // It doesn't work since default constructor waits the reference to outer object (parent)
          // so it's impossible to do in this way
          //Outer.Inner innerClass1 = new Outer.Inner();


        // It works only if class is static (nested)
        // You may use the nested classes separate from his parent (outer) class
        // Outer.Inner someInner = new Outer.Inner();




    }
}
