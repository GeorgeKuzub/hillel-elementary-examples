package datastructure;

public class MainClass {
    public static void main(String[] args) {
        StackC stack = new StackC(5);
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');


        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        stack.push('z');
        System.out.println("Just getting the top of stack element without extracting it: " + stack.peek());
        System.out.println("Extracting the last added element of stack: " + stack.pop());

        if (stack.isEmpty()) {
            System.out.println("The stack is empty!");
        }
    }
}
