package CRT2025.OOPS.polymorphism;

public class StudentMain {
    public static void main(String[] args) {
        Student s =new Student();
        s.study();
        FirstYear f = new FirstYear();
        f.study();
        Secondyear s2 = new Secondyear();
        s2.study();
    }
}
