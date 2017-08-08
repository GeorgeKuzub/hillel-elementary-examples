package EnumDemo;

public enum Fruit {
    Apple(100), StrawBerry(99), Lemon(101), Banana(150), Ananas(800);

    private int price; // price of each fruit

    // Constructor
    Fruit(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}
