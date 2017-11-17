package concurency.executors;


public class MultiThreadWay {
    public static void go() {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Countdown());
            t.start();
            System.out.println("Waiting for countdown task with id=" + t.getName());
        }
    }
}
