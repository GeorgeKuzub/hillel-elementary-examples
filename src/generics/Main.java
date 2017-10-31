package generics;

import oop.inheritance.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("_1");
        Employee emp2 = new Employee("_2");

        Pair<Employee> pairEmp = new Pair<>(emp1, emp2);

        System.out.println("Original order of pair elements:");
        printPair(pairEmp);
        pairEmp.swap();
        System.out.println("After swapping:");
        printPair(pairEmp);

        System.out.println("And after alternative swapping:");
        pairEmp = altPairSwap(pairEmp);
        printPair(pairEmp);

        ThreeTuples<Employee> threeBestEmps = new ThreeTuples<>(
                new Employee("Abramov"),
                new Employee("Volodin"),
                new Employee("Mihalich")
        );

        System.out.println("The third member is: " + threeBestEmps.third);
        threeBestEmps = threeBestEmps.reverse();
        System.out.println("The third member after reversing is: " + threeBestEmps.third);
    }

    public static void printPair(Pair<?> p) {
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
    }

    public static <T> Pair<T> altPairSwap(Pair<T> inPair) {
        return new Pair<>(inPair.getSecond(), inPair.getFirst());
    }
}
