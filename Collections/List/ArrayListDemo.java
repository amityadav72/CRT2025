package CRT2025.Collections.List;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();

        obj.add("Ayush");
        obj.add(true);
        obj.add(10);

        for (int i = 0; i < obj.size(); i++) {
            System.out.println("ele :: "+ obj.get(i));
        }
    }
}
