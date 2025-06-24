package CRT2025.Vectors;
import java.util.Iterator;
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector obj = new Vector();

        // duplicate
        obj.add(10);
        obj.add(20);
        obj.add(10);

        // hetrogenuos
        obj.add("abc");

        // null
        obj.add(null);

        for (Iterator iterator = obj.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
