package generics;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void swap() {
        T temp = first;
        first = second;
        second = temp;
    }

    @Override
    public String toString() {
        return "PairContainer{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}