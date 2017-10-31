package generics;

public class ThreeTuples<T> extends Pair<T> {
    public final T third;

    public ThreeTuples(T first, T second, T third) {
        super(first, second);
        this.third = third;
    }

    public ThreeTuples<T> reverse() {
        return new ThreeTuples<>(third, getSecond(), getFirst());
    }
}
