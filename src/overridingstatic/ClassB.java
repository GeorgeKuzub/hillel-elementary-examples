package overridingstatic;

public class ClassB extends ClassA {

    public static void doAction(ClassA a) {
        System.out.println("ClassB");
    }

}
