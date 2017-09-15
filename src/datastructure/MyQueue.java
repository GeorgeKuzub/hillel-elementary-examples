package datastructure;

public class MyQueue {

    private int maxSize;
    private int head;
    private int tail;
    private long[] arr;
    private int nItems;

    public MyQueue(int size) {
        maxSize = size;
        arr = new long[maxSize];
        head = 0;
        tail = 0;
        nItems = 0;
    }

    public long peek() {
        return arr[head];
    }

    public void add(long data) {
        if (tail > maxSize - 1) {
            tail = 0;
        }

        arr[tail++] = data;
        nItems++;
    }

    public long poll() {
        long result = arr[head++];
        if (head == maxSize) {
            head = 0;
        }
        nItems--;
        return result;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

}