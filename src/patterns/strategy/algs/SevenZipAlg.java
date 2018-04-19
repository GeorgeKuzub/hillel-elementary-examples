package patterns.strategy.algs;

public class SevenZipAlg implements Compress {

    @Override
    public void encode(String text) {
        System.out.println("7zip compressing demoExtendsAndWildCard algorithm for input text: \n" + text);
        System.out.println("After compression result is: ");
        System.out.println(text.substring(0, text.length() - 3));
        System.out.println();
    }
}
