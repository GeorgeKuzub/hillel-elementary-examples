package generics.pecs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        erasureDemo();
        demoExtendsAndWildCard();
        demoPECS();
    }

    public static void erasureDemo() {
        //SomeType someType = //bad approach since here we don't use generic approach
        // new SomeType();

        SomeType<String> someType = //Always use generic-approach if class provides it.
                new SomeType();

        List<String> sList = Arrays.asList("aa", "bb", "cc");

        someType.process(sList);
    }

    public static void demoPECS() {
        List originalList = Arrays.asList(
                new Product("Sony", 100),
                new Phone(5.5, "Philips", 110),
                new Camera(16, "Panasonic", 120));

        List<Product> newList = new LinkedList();

        copy(originalList, newList);
        System.out.println(newList);
    }

    public static void demoExtendsAndWildCard() {

        List<Phone> lPhones = Arrays.asList(
                new Phone( 4, "Huawei", 100),
                new Phone(4.5, "Xiaomi", 110),
                new Phone(5,"Nokia", 120),
                new Phone(6, "Samsung", 180));

        List<Product> lProducts = Arrays.asList(
                new Product("Sony", 100),
                new Product("Philips", 110),
                new Product("Panasonic", 120),
                new Camera(16, "Cannon", 140),
                new Phone(6, "Samsung", 180));


        // you can't use this method for lPhones or lCameras since List<Phone> != List<Product>
        // but code below will work perfectly only for List<Product>
        boolean resultForLessGenericMethod =
                containLessGeneric(lProducts, new Camera(16, "Cannon", 140));
        System.out.println(resultForLessGenericMethod);

        // This approach works and for List<Phone>
        boolean resultForMoreGenericMethod =
                containMoreGeneric(lPhones, new Phone(6, "Samsung", 180));

        System.out.println(resultForMoreGenericMethod);

        // as well as for List<Product>
        resultForMoreGenericMethod =
                containMoreGeneric(lProducts, new Camera(10, "Sony", 100));
        System.out.println(resultForMoreGenericMethod);
    }


    // It looks fine at glance, but this variant wont' work for List<Camera> or List<Phone>
    // and if you pass a List<Camera> this code won't work since List<Product> != List<Camera>
    // you might create a list of phones or list of cameras and just try to pass to this method.
    // But it won't work!
    // So actually you may pass only List<Products> to this code and it will work nicely.
    private static <E extends Product> boolean containLessGeneric(List<E> all, E e) {
        for (E element : all) {
            if (element.getName().equalsIgnoreCase(e.getName())) {
                return true;
            }
        }
        return false;
    }

    // This code is more general and work like a charm for all type of List<Product, Phone, Camera>
    private static boolean containMoreGeneric(List<? extends Product> all, Product e) {
        for (Product element : all) {
            if (element.getName().equalsIgnoreCase(e.getName())) {
                return true;
            }
        }
        return false;
    }

    private static void copy(List<? extends Product> src, List<? super Product> dst) {
        for (Product p : src) {
            dst.add(p);
        }
    }

    // Search only for any List<OldPhone> that also must implements the next below interfaces
    private static <T extends OldPhone & SomeInterface1 & SomeInterface2>
        Product find(List<T> pList, Product product) {
            if (pList.contains(product)) {
                return pList.get(pList.indexOf(product));
            }

            return new Product("Nothing found", -1);
    }

}
