package generics.arrs;



public class PairContainer<T, V> {
    private static final int MAX_CAPACITY = 100;
    private T[]  first;
    private V[] second;
    private int ind;

    public PairContainer() {
        this.first = (T[]) new Object[MAX_CAPACITY];
        this.second = (V[]) new Object[MAX_CAPACITY];
    }

    void push(T data1, V data2) {
        if (ind == MAX_CAPACITY) {
            throw new RuntimeException("Container is overfull!"); //TODO: create a custom ex here
        }

        first[ind] = data1;
        second[ind] = data2;
        ind++;
    }

    Entry<T, V> pop() {
        if (ind == 0) {
            throw new RuntimeException("Nothing data to fetch!"); //TODO: create a custom ex here
        }

        Entry returnedEntry = new Entry<T, V>(first[ind - 1], second[ind - 1]);
        ind--;
        return returnedEntry;
    }

    public int getActualSize() {
        return ind;
    }

    public static int getMaxCapacity() {
        return MAX_CAPACITY;
    }

    static class Entry<T, V> {
        T first;
        V second;

        Entry(T first, V second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public V getSecond() {
            return second;
        }
    }

}
