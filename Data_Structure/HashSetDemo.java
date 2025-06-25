package CRT2025.Data_Structure;
import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

       set.add("A");
       set.add("test1");
       set.add("data1");
       set.add("test2");
       set.add("data2");

       set.add("test1");

       System.out.println(set);

    }
}
