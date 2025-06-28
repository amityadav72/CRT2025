package CRT2025.Data_Structure.Sets.TreeSet;
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        Set treesetObj = new TreeSet();

        treesetObj.add(3);
        treesetObj.add(-2);
        treesetObj.add(10);
        treesetObj.add(30);
        treesetObj.add(10); // duplicate value will not print

        System.out.println(treesetObj);
    }

}
