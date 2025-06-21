package CRT2025.MultiThreading;

public class ThreadRunnableImp {

    public static void main(String[] args) {
        FirstRunnableThread t1 = new FirstRunnableThread();
        SecondRunnableThread t2 = new SecondRunnableThread();


        Thread t3 = new Thread(t1);
        Thread t4 = new Thread(t2);


        t3.start();
        t4.start();
    }
}


class FirstRunnableThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
        }
    }
}


class SecondRunnableThread implements Runnable {
    @Override
    public void run() {
        for (int i = 51; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
        }
    }
}
