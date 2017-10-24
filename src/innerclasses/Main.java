package innerclasses;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.anonymous();

        Outer.Inner innerInstance = outer.getInnerInst();
        System.out.println(innerInstance.localInt);

        innerInstance.someLocalMethod();
        innerInstance.getLocalInt();

//        Outer.Inner innerClass2 = new Outer.Inner(); // get failed on compilation stage
        Outer.Inner innerClass2 = new Outer.Inner(); // It'll be corrected, if InnerClass is static
    }
}
