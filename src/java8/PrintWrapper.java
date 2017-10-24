package java8;

import java.util.function.Consumer;

public class PrintWrapper implements Consumer {
    @Override
    public void accept(Object o) {
        System.out.println("time :" + o);
    }
}