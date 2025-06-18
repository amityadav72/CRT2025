package CRT2025.OOPS.inheritance.MultilevelInheritence;


public class Child extends Parent {
    String color = "White";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getChildDetails() {
        System.out.println("Child's Color: " + getColor());
        System.out.println("Parent Size: " + getSize());
        System.out.println("Parent1 Color1: " + getColor1());
        System.out.println("Parent2 Origin: " + getOrigin());
    }
}
