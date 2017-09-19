package jcf;

import java.util.ArrayList;
import java.util.List;

public class DemoClass {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(0);
        listInt.add(1);
        listInt.add(2);
        listInt.add(300);
        System.out.println(listInt.size());
        System.out.println();
        listInt.add(2,10);
        for (Integer e : listInt) {
            System.out.println(e);
        }
        System.out.println(listInt.size());
    }
}
