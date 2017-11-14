package concurency;

import java.util.concurrent.TimeUnit;

class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Task " + name + ": started");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Task " + name + " : " + i);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task[" + name + "]: finished");
    }
}
