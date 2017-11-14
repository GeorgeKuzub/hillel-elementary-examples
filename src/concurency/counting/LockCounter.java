package concurency.counting;

public class LockCounter implements Counter {
//    Object obj = new Object();

    private long counter;

    public synchronized long inc() {
        return counter++;
    }

//    public long inc2() {
//        synchronized (obj) {
//            counter++;
//        }
//        return counter;
//    }

    public long incUnsafe() {
        return counter++;
    }


}
