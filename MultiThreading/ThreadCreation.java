package CRT2025.MultiThreading;

public class ThreadCreation {
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();


        //
        t1.start();
        t2.start();

    }
}

class FirstThread extends Thread{
    @Override
    public void run() {
    System.out.println(Thread.currentThread().getName());
        for(int i =1; i<=50; i++)
        System.out.println(i);
    }
}


class SecondThread extends Thread{
    @Override
    public void run() {

        for(int i=50; i<=101; i++)
            System.out.println(i);
    }
}
