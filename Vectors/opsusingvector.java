package CRT2025.Vectors;

import java.util.Vector;

public class opsusingvector {
    public static void main(String[] args) {

        Vector obj = new Vector();

        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);

        obj.remove(2);
        System.out.println(obj);
        obj.removeFirst();
        System.out.println(obj);
        obj.removeLast();
        obj.remove(1);
        System.out.println(obj);




        obj.clear();
        System.out.println(obj);
    }
}
