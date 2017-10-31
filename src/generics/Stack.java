package generics;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> list = new ArrayList<>();

    public void push(T t) {
        list.add(t);
    }

    public T pop() {
        int index = list.size() - 1;

        T lastElement = list.get(index);
        list.remove(index);

        return lastElement;
    }

    public T peek() {
        int index = list.size() - 1;
        return list.get(index);
    }

}
