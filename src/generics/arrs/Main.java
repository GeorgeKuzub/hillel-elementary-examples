package generics.arrs;

public class Main {
    public static void main(String[] args) {
        PairContainer<String, Integer> container = new PairContainer<>();
        container.push("Laptop", 1000);
        container.push("desktop", 500);
        container.push("mobile", 300);

        PairContainer.Entry<String, Integer> entry1 = container.pop();
        PairContainer.Entry<String, Integer> entry2 = container.pop();
        PairContainer.Entry<String, Integer> entry3 = container.pop();

        System.out.println(entry1.getFirst() + " : " + entry1.getSecond());
        System.out.println(entry2.getFirst() + " : " + entry2.getSecond());
        System.out.println(entry3.getFirst() + " : " + entry3.getSecond());
    }
}
