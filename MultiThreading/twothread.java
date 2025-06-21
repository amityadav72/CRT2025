package CRT2025.MultiThreading;

public class twothread {
    public static void main(String[] args) {
        FirstDemoThread firstDemoThread = new FirstDemoThread();
        firstDemoThread.setName("Low");
        firstDemoThread.setPriority(2);
        firstDemoThread.start();

        SecondDemoThread secondDemoThread = new SecondDemoThread();
        secondDemoThread.setName("High");
        secondDemoThread.setPriority(8);
        secondDemoThread.start();

    }
}

class FirstDemoThread extends Thread {
    @Override
    public void run() {
        System.out.println("Amit");
        System.out.println(Thread.currentThread().getName());
        System.out.println(getPriority());
    }
}

class SecondDemoThread extends Thread {
    @Override
    public void run() {
        System.out.println("Yadav");
        System.out.println(Thread.currentThread().getName());
        System.out.println(getPriority());
    }
}