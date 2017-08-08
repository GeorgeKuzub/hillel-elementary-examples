package EnumDemo;

public class EnumDemo {
    public static void main(String args[]) {
        Fruit fruit;

        // Display price of an Apple
        System.out.println(Fruit.Apple.getPrice());

        // Display all fruit and prices.
        System.out.println("All apple prices:");
        for (Fruit f : Fruit.values())
            System.out.println(f + " costs " + f.getPrice() + " cents.");
    }
}
