package CRT2025.Data_Structure.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Deque queueobj = new ArrayDeque();

//        queueobj.add("A");
//        queueobj.add("B");
//        queueobj.add("C");
//        queueobj.add("D");

        queueobj.offer("A");
        queueobj.offer("B");
        queueobj.offer("C");
        queueobj.offer(10);

        System.out.println("Elements are " +queueobj);
        System.out.println("Peek elements :: " + queueobj.peek());
        System.out.println("Poll elements :: " + queueobj.poll());


    }
}
