package generics.pecs;

import java.util.Collection;
import java.util.List;

public class SomeType<E> {

    public void process(Collection<E> list) {
        for (E element: list) {
            System.out.println(element);
        }
    }

    public void process(List<Integer> lInts) {
        for (Integer data: lInts) {
            System.out.println(data);
        }
    }
}
