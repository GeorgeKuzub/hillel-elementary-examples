package jcf;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
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

        List listObjs = new ArrayList();
        listObjs.add("str");
        listObjs.add(11);
        listObjs.add('a');
        listObjs.add(1.3D);
        listObjs.add(true);


    }

    public void processElements(List lst) {
        for (Object e : lst) {
            if (e instanceof String) {
              // do someything
            } else if (e instanceof Integer) {
                //
            }
        }
    }
}
