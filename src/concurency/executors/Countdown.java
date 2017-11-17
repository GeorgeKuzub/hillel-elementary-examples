package concurency.executors;

/**
 * Created by geo on 11.05.2017.
 */
public class Countdown implements Runnable {
    private static int taskCount = 0;
    private final int id = taskCount++;
    protected int countDown = 20;

    public Countdown() {
    }

    public Countdown(int countDown) {
        this.countDown = countDown;
    }

    private String status() {
        return "#" + id + "(current count = " +
                (countDown > 0 ? countDown : "Stop!") + "). ";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            if (countDown <= 5) {
                System.out.println(status());
            }
            Thread.yield();
        }

    }
}