package intro;

public class PostFixPrefixIncrement {



    public static void main(String[] args) {
        int i = 4;
        int k = i++ * ++i;

        System.out.println("i=" + i);
        System.out.println("k=" + k);
    }
}
