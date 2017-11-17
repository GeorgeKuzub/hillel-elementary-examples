package concurency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class DeadLock {
    static Logger logger = Logger.getLogger(DeadLock.class.getName());
    Lock lock = new ReentrantLock();

    public static void main(String[] args) {

        final Account a1 = new Account(1);
        a1.sum = 100;
        final Account a2 = new Account(2);
        a2.sum = 300;

        Thread t1 = new Thread(() -> {
            Account.transact(a1, a2, 10);
        },
                "<Transact a1 to a2>");

        Thread t2 = new Thread(() -> {
            Account.transact(a2, a1, 20);
        },
                "<Transact a2 to a1>");

        t1.start();
        t2.start();
    }

    static class Account {
        int sum;
        int id;

        public Account(int id) {
            this.id = id;
        }

        static void transact(final Account fromAcc, final Account toAcc, int amount) {
            Account lock1, lock2;

            lock1 = fromAcc;
            lock2 = toAcc;

//            if (fromAcc.id < toAcc.id) {
//                lock1 = fromAcc;
//                lock2 = toAcc;
//            } else {
//                lock1 = toAcc;
//                lock2 = fromAcc;
//            }

            synchronized (lock1) {
                logger.info("Lock(" + lock1.id + ")" + "was hold by thread (" +
                        Thread.currentThread().getName()
                        + ")" + "and waiting for unlock  with LockId <" + lock2.id + ">");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2) {
                    logger.info("Lock(" + lock2.id + ")" + "was hold by thread" +
                            Thread.currentThread().getName()
                            + ")" + "and waiting for unlock  with Lockid <" + lock1.id + ">");
                    fromAcc.sum -= amount;
                    toAcc.sum += amount;
                }
            }
        }
    }
}
