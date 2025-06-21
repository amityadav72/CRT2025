package CRT2025.MultiThreading;

public class ThreadNameDemo {

    public static void main(String[] args) {
        MyThreadName obj1 = new MyThreadName();
        obj1.setName("First Name"); // set name of thread
        obj1.start();
        MySecondThread obj2= new MySecondThread();
        obj2.setName("Second Name");
        obj2.start();


    }
}

class MyThreadName extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <=10; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
        }
    }
}


class MySecondThread extends Thread {
    @Override
    public void run() {
        for (int i = 11; i <=20; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
        }
    }
}