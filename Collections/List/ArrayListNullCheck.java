package CRT2025.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNullCheck {
    public static void main(String[] args) {

        List arraylistobj = new ArrayList();
        arraylistobj.add(null);


        for (int i = 0; i < arraylistobj.size(); i++) {
            System.out.println("ele :: "+ arraylistobj.get(i));
        }
    }
}
