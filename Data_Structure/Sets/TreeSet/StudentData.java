package CRT2025.Data_Structure.Sets.TreeSet;

import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    String name;
    int age;
    String result;

    public Student(String name, int age, String result) {
        this.name = name;
        this.age = age;
        this.result = result;
    }

    @Override
    public int compareTo(Student other) {

        int nameCompare = this.name.compareTo(other.name);
        if (nameCompare != 0) {
            return nameCompare;
        }
       
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " - " + age + " - " + result;
    }
}

public class StudentData {
    public static void main(String[] args) {
        Set<Student> treeSet = new TreeSet<>();

        treeSet.add(new Student("Amit", 18, "Pass"));
        treeSet.add(new Student("Sneha", 19, "Pass"));
        treeSet.add(new Student("Ravi", 17, "Fail"));
        treeSet.add(new Student("Amit", 20, "Pass")); // Different age from earlier Amit

        System.out.println("Student Data (Sorted by Name, then Age):");
        for (Student s : treeSet) {
            System.out.println(s);
        }
    }
}
