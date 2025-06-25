package CRT2025.Data_Structure.LinkedList;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet linkHashSet = new LinkedHashSet();
        linkHashSet.add("A");
        linkHashSet.add("B");
        linkHashSet.add(true);

        // null insertion

        linkHashSet.add(null);

        System.out.println(linkHashSet);
    }
}
