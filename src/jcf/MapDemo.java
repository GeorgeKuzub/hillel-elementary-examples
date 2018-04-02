package jcf;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        sortOfCustomObjects();
        mapDemo();
    }

    private static void sortOfCustomObjects() {
        System.out.println("Sorting of the Car objects.");

        Car[] arr = new Car[] {
                new Car("Toyota Corolla", 1999),
                new Car("Toyota Carina", 1998),
                new Car("Ford Focus", 1997),
                new Car("Ford Fiesta", 1996),
                new Car("Opel Vectra", 1995),
                new Car("Skoda Octavia", 2012),
                new Car("WW Golf", 2024)};

        Arrays.sort(arr);
        System.out.println("\n\t - based on its release years:");
        System.out.println(Arrays.toString(arr));

        List<Car> listCars = new ArrayList<>();
        Collections.addAll(listCars, arr);
        System.out.println("\n\t - example of reverse sorting for the cars being kept in a ArrayList");
        Collections.sort(listCars, Collections.reverseOrder());
        System.out.println(listCars);
    }

    public static void mapDemo() {
        System.out.println("\nMap examples: ");
        // key(String) - name of a book and value(Integer) it's a price for a book
        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("Book3", 102);
        map1.put("Book4", 103);
        map1.put("Book1", 100);
        map1.put("Book2", 101);
        map1.put("Book5", 104);

        map1.replace("Book3", 102, 202);
        map1.replace("Book4", 133);
        System.out.println("The map after some replacing:");
        System.out.println(map1);

        // Getting set of Entries(pairs of values of type <key, value>)
        for (Map.Entry<String, Integer> pair : map1.entrySet()) {
            if (pair.getKey().equalsIgnoreCase("book5")) {
                System.out.print("This is the my favorite book" + pair.getKey());
                System.out.println(" and it price is = " + pair.getValue());
            }
        }


        // Getting set of keys
        String keyForRemovingBook = null;
        for (String key : map1.keySet()) {
            if (key.equalsIgnoreCase("book4")) {
//                map1.remove(key); // it's impossible to remove an element from here(inside foreach)
                keyForRemovingBook = key;
            }
        }
        map1.remove(keyForRemovingBook); // but it's possible to do here, after foreach

        // Getting total price of all rest books
        int sumPrices = 0;
        for (Integer price: map1.values()) {
            sumPrices += price;
        }
        System.out.println("Total price for all books is equal to : " + sumPrices);

        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.putAll(map1);
        System.out.println("Output of another map:");
        System.out.println(map2);

        System.out.println("Check if map contains some key:");
        System.out.println(map2.containsKey(keyForRemovingBook));

        map1.clear();
        System.out.println("Checking if map is empty: ");
        System.out.println(map1.isEmpty());

    }
}
