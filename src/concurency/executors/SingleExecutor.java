package concurency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SingleExecutor {

    public static void go() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new Countdown());
        }
        executorService.shutdown();
    }
}
