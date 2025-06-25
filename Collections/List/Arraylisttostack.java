package CRT2025.Collections.List;

import java.util.*;

public class Arraylisttostack {

    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>();

        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);

        Stack<Integer> obj1 = new Stack<>();

        for (int i = 0; i < obj.size(); i++) {
            obj1.push(obj.get(i));
        }

        // Pop and print elements (this prints in reverse order)
        System.out.println("Elements in reverse order:");
        while (!obj1.isEmpty()) {
            System.out.println(obj1.pop());
        }
    }
}
