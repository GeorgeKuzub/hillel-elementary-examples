package patterns.strategy;

import patterns.strategy.algs.Compress;

public class StrategyAlgoritms {
    private Compress algorithm;

    public StrategyAlgoritms(Compress algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(Compress algorithm) {
        this.algorithm = algorithm;
    }

    public Compress getAlgorithm() {
        return algorithm;
    }
}
