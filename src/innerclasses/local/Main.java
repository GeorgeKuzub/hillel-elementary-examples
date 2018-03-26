package innerclasses.local;

public class Main {
    public static void main(String[] args) {
        Pair myPair =  new LocalDemo().getPair();
        System.out.println(myPair.getData());
        System.out.println(myPair.getName());
    }
}
