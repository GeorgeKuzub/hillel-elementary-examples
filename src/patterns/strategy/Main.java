package patterns.strategy;

import patterns.strategy.algs.RarAlg;
import patterns.strategy.algs.SevenZipAlg;
import patterns.strategy.algs.ZipAlg;

public class Main {
    public static void main(String[] args) {

        StrategyAlgoritms strategy =
                new StrategyAlgoritms(new RarAlg());

        strategy.getAlgorithm().encode("Some Text for compression");

        strategy.setAlgorithm(new ZipAlg());
        strategy.getAlgorithm().encode("Some Text for compression");

        strategy.setAlgorithm(new SevenZipAlg());
        strategy.getAlgorithm().encode("Some Text for compression");


    }
}
