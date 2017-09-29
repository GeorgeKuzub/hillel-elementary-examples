package jcf.queue;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i * 10 + 10));
        }
        QueueDemo.printQueue(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(ints.size());
        QueueDemo.printQueue(priorityQueue);

        priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQueue(priorityQueue);

        String seq_str = "Yuriy; Olga; Marina; Alex";
        List<String> names = Arrays.asList(seq_str.split(";"));
        PriorityQueue<String> namesPriorityQueue = new PriorityQueue<>(names);
        QueueDemo.printQueue(namesPriorityQueue);

        namesPriorityQueue = new PriorityQueue<>(names.size(), Collections.reverseOrder());
        namesPriorityQueue.addAll(names);
        QueueDemo.printQueue(namesPriorityQueue);

        Set<Character> charSet = new HashSet<Character>();

        for (char c : seq_str.toCharArray()) {
            charSet.add(c); // autoboxing
        }
        PriorityQueue<Character> charactersPQ = new PriorityQueue<>(charSet);
        QueueDemo.printQueue(charactersPQ);
    }
}
