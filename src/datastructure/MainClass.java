package datastructure;

public class MainClass {
    public static void main(String[] args) {
        callDemoStack();
        callDemoQueue();

    }

    public static void callDemoStack() {
        System.out.println("Stack Characters Demo:");

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
        System.out.println();
    }


    public static void callDemoQueue() {
        System.out.println("Queue For Long Numbers Demo:");
        MyQueue myQueue = new MyQueue(5);

        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);

        System.out.println("Extract and remove element #1: " + myQueue.poll());
        System.out.println("Extract and remove element #2: " + myQueue.poll());
        System.out.println("Extract and remove element #3: " + myQueue.poll());

        myQueue.add(50);
        myQueue.add(60);
        myQueue.add(70);
        myQueue.add(80);

        while (!myQueue.isEmpty()) {
            long l = myQueue.peek();
            System.out.print(l + " ");
        }
        System.out.println();
    }
}
