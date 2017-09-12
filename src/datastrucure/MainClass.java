package datastrucure;

public class MainClass {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');


        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println(stack.peek());

    }
}
