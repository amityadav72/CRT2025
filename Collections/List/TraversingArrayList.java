package CRT2025.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraversingArrayList {
    public static void main(String[] args) {
        List arraylistobj = new ArrayList();
        arraylistobj.add(null);
        arraylistobj.add(10.50);
        arraylistobj.add(10);
        arraylistobj.add("Ayush");
       // arraylistobj.remove("Ayush"); to remove element


        // First Way

        System.out.println("Traversing ArrayList using for loop");
        for (int i = 0; i < arraylistobj.size(); i++) {
            System.out.println("ele :: "+ arraylistobj.get(i));
        }

        // Second Way using itarators

        System.out.println("Traversing ArrayList using itarators");
        Iterator itr = arraylistobj.iterator();
        while (itr.hasNext()) {
            System.out.println("ele :: "+ itr.next());
        }

        // third way using for each loop

        System.out.println("Traversing ArrayList using for each loop");
        for (Object obj : arraylistobj) {
            System.out.println("ele :: "+ obj);
        }
    }
}
