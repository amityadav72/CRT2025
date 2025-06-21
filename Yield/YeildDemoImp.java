package CRT2025.Yield;

public class YeildDemoImp {
    public static void main(String[] args) {
        YieldDemo t1 = new YieldDemo();
        t1.start();

    }
}

class YieldDemo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().yield();
        }
    }
}