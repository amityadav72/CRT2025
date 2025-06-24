package CRT2025.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class DuplicateArrayList {
    public static void main(String[] args) {

        List arraylistobj = new ArrayList();
        arraylistobj.add(null);
        arraylistobj.add(10);
        arraylistobj.add(10);



        for (int i = 0; i < arraylistobj.size(); i++) {
            System.out.println("ele :: "+ arraylistobj.get(i));
        }
    }
}
