package java8.functions;

@FunctionalInterface
public interface Converter<T, F> {
    T convert(F from);
}
