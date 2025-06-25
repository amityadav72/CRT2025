package CRT2025.Data_Structure.LinkedList;
import java.util.*;

public class ListCopy {
    public static void main(String[] args) {
        List linkedList = new LinkedList();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add(10);
        linkedList.add(true);


        List obj = new LinkedList();

        for(int i=0; i<linkedList.size(); i++){
            obj.add(linkedList.get(i));
        }

        System.out.println(obj);


    }
}
