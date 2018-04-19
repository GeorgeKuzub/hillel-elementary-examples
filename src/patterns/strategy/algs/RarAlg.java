package patterns.strategy.algs;

public class RarAlg implements Compress {
    @Override
    public void encode(String text) {
        System.out.println("RAR compressing demoExtendsAndWildCard algorithm for input text: \n" + text);
        System.out.println("After compression result is: ");
        System.out.println(text.substring(0, text.length() - 1));
        System.out.println();
    }
}
