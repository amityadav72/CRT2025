package CRT2025.MultiThreading;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadSetPriorityDemo t1 = new ThreadSetPriorityDemo();
        //t1.setPriority(Thread.MAX_PRIORITY);
       // t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(3);

        t1.start();
    }
}

class ThreadSetPriorityDemo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
        }
    }
}
