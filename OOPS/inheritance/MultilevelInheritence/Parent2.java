package CRT2025.OOPS.inheritance.MultilevelInheritence;



public class Parent2 {
    String origin = "Earth";

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public static void main(String[] args) {

        Child c = new Child();
        c.setColor("Black");
        c.setSize("Medium");
        c.setColor1("Red-Orange");
        c.setOrigin("India");

        c.getChildDetails();

    }
}
