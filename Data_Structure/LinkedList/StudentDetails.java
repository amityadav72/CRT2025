package CRT2025.Data_Structure.LinkedList;

import java.util.HashSet;
import java.util.Set;

class Student {
    String name;
    int age;
    String status;

    public Student(String name, int age, String status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Status: " + status;
    }

//    @Override
    public int hashCode() {
        return name.hashCode() + age + status.hashCode();
    }
}

public class StudentDetails {
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        // Adding student objects
        studentSet.add(new Student("Amit", 18, "Pass"));
        studentSet.add(new Student("Sneha", 19, "Pass"));
        studentSet.add(new Student("Ravi", 17, "Fail"));
        studentSet.add(new Student("Amit", 18, "Pass"));


        System.out.println("Student Details:");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}
