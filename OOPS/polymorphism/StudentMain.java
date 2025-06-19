package CRT2025.OOPS.polymorphism;

public class StudentMain {
    public static void main(String[] args) {
        Student s =new Student();
        s.study();

        Student f = new FirstYear();
        f.study();

        Student s2 = new Secondyear();
        s2.study();
    }
}
