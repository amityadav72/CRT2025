package CRT2025.Data_Structure.LinkedList;

import java.util.*;
public class LinkedinListDemo {
    public static void main(String[] args) {

        List linkedList = new LinkedList();


        linkedList.add("A");
        linkedList.add("B");
        linkedList.add(10);
        linkedList.add(true);

        // insert the element at specific
        linkedList.add(2, "C");
        System.out.println(linkedList);

        Iterator itr = linkedList.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
