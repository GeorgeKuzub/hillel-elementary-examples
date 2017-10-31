package generics;

public class Main2 {
    public static void main(String[] args) {
        Stack<String> stackOfStrings = new Stack<String>();
        stackOfStrings.push("A");
        stackOfStrings.push("B");
        stackOfStrings.push("C");

        System.out.println(stackOfStrings.pop());
        System.out.println(stackOfStrings.pop());
        System.out.println(stackOfStrings.peek());
        System.out.println(stackOfStrings.pop());

        System.out.println(stackOfStrings.pop());
    }
}
