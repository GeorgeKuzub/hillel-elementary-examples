package innerclasses.inner;

public class Main {
    public static void main(String[] args) {
        demoOneDirectionIterator();
        demoTwoDirectionIterator();
    }

    public static void demoOneDirectionIterator() {
        List list = new List();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // Getting the special object that supports iteration only from left to right direction
        List.Iterator iterator = list.getIterator();

        System.out.println("One direction iterating: ");
        while (!iterator.end()) {
            System.out.println(iterator.current());
            iterator.next();
        }
        System.out.println();
    }

    public static void demoTwoDirectionIterator() {
        ExtendedList extendedList = new ExtendedList();
        extendedList.add("A");
        extendedList.add("B");
        extendedList.add("C");
        extendedList.add("D");
//
        // Getting the BiIterator instance that supports iteration as from left to right
        // and vice verse direction

        // Here from left to right to until we get the end of our list

        ExtendedList.BiIterator biIterator = extendedList.getIterator();

        System.out.println("Two direction demonstration of iterating: ");

        while (!biIterator.end()) {
            System.out.println(biIterator.current());
            biIterator.next();
        }

        System.out.println();

        // Here from right to left until we get the begin of our list
        while (!biIterator.begin()) {
            System.out.println(biIterator.current());
            biIterator.prev();
        }

        // And from left to right again :)
        System.out.println();
        while (!biIterator.end()) {
            System.out.println(biIterator.current());
            biIterator.next();
        }
    }
}

