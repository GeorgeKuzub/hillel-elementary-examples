package concurency.executors;


public class Traditional {
    public static void go() {
        Countdown countdown = new Countdown();
        countdown.run();
    }
}
