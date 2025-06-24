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
        arraylistobj.add(null);

        // Remove all null values
        arraylistobj.removeIf(obj -> obj == null);

        // Remove specific object
        arraylistobj.remove("Ayush");

        // Remove by index (remove first element - index 0)
        if (!arraylistobj.isEmpty()) {
            arraylistobj.remove(0); // Remove first element
        }

        // Remove last element if not empty
        if (!arraylistobj.isEmpty()) {
            arraylistobj.remove(arraylistobj.size() - 1);
        }

        // First Way - Using for loop
        System.out.println("Traversing ArrayList using for loop");
        for (int i = 0; i < arraylistobj.size(); i++) {
            System.out.println("ele :: " + arraylistobj.get(i));
        }

        // Before Clear
        System.out.println("\nBefore Clear");
        Iterator<Object> itr = arraylistobj.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Clear the list
        arraylistobj.clear();

        // After Clear
        System.out.println("\nAfter Clear");
        Iterator<Object> itr1 = arraylistobj.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        System.out.println("Is list empty? :: " + arraylistobj.isEmpty());
    }
}
