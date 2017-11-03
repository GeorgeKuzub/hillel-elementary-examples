package java8.interfaces;

@FunctionalInterface
public interface TrioInterface<T, K, V, R > {
    R test(T t1, T t2, K k, V v);
}
