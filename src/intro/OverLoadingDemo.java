package intro;

public class OverLoadingDemo {
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static double add(double n1, double n2) {
        return n1 + n2;
    }

//    public static double add(double n1, int n2) {
//        return (int)(n1 + n2);
//    }

    public static void main(String[] args) {
        System.out.println(add(5, 10));
        System.out.println(add(5.0, 10));
    }
}
