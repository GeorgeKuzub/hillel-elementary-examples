package jcf.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
    public static void printQueue(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            queue.offer(random.nextInt(i * 10));
        }
        printQueue(queue);

        System.out.println("_____________________");
        Queue<Character> qc = new LinkedList<>();
        for (char c : "I like Java".toCharArray()) {
            qc.offer(c);
        }
        printQueue(qc);
    }
}
