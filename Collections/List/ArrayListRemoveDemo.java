package CRT2025.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemoveDemo {
    public static void main(String[] args) {

        List<Object> arraylistobj = new ArrayList<>();
        arraylistobj.add(null);
        arraylistobj.add(10.50);   // Double
        arraylistobj.add(10);      // Integer
        arraylistobj.add("Ayush"); // String

   arraylistobj.remove("Ayush"); // Uncomment to remove "Ayush"

        // First Way - Using for loop
        System.out.println("Traversing ArrayList using for loop");
        for (int i = 0; i < arraylistobj.size(); i++) {
            System.out.println("ele :: " + arraylistobj.get(i));
        }
//
//        // Second Way - Using iterators
//        System.out.println("\nTraversing ArrayList using iterators");
//        Iterator<Object> itr = arraylistobj.iterator();
//        while (itr.hasNext()) {
//            System.out.println("ele :: " + itr.next());
//        }
//
//        // Third Way - Using for-each loop
//        System.out.println("\nTraversing ArrayList using for-each loop");
//        for (Object obj : arraylistobj) {
//            System.out.println("ele :: " + obj);
//        }
    }
}
