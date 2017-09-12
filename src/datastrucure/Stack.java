package datastrucure;

public class Stack {
    private int size;
    private char[] array;
    private int sp;

    public Stack(int size) {
        this.size = size;
        array = new char[size];
    }

    public void push(char data) {
        if (sp < size) {
            array[sp++] = data;
        }
    }

    public char pop() {
        if (sp > 0) {
            return array[--sp];
        }
        return 0;
    }

    public char peek() {
        if (sp > 0) {
            return array[sp-1];
        }
        return 0;
    }

    public boolean isEmpty() {
        return sp == 0;
    }

    public boolean isFull() {
        return sp == size;
    }
}
