package CRT2025.OOPS.inheritance.HeirachicaliInheritence;

public class ParentDetails {
    public static void main(String[] args) {
        Brother b = new Brother("Mr. Kumar", "Rahul");
        Sister s = new Sister("Mr. Kumar", "Pooja");

        System.out.println("Brother's Parent: " + b.getParentName());
        System.out.println("Brother Name: " + b.getBrotherName());

        System.out.println("Sister's Parent: " + s.getParentName());
        System.out.println("Sister Name: " + s.getSisterName());
    }
}
