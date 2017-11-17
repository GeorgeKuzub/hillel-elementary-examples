package concurency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by geo on 12.05.2017.
 */
public class FixedThreadPool {

    public static void go() {
        ExecutorService serviceExecutor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            serviceExecutor.execute(new Countdown());
        }
        serviceExecutor.shutdown();
    }
}
