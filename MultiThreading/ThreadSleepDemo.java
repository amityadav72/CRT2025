package CRT2025.MultiThreading;

public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleepMethodDemo t2 = new ThreadSleepMethodDemo();
        t2.start();


    }
}


class ThreadSleepMethodDemo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            try {
                Thread.currentThread().sleep(10000);

            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}