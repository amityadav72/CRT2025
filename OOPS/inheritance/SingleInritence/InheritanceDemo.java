package CRT2025.OOPS.inheritance.SingleInritence;

// Main class to test inheritance
public class InheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.setParentnumber(100);
        child.setChildnumber(200);

        System.out.println("Parent Number: " + child.getParentnumber());
        System.out.println("Child Number: " + child.getChildnumber());
    }
}

// Parent class
class Parent {
    int parentnumber = 10;

    public int getParentnumber() {
        return parentnumber;
    }

    public void setParentnumber(int parentnumber) {
        this.parentnumber = parentnumber;
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    int childnumber = 20;


    public int getChildnumber() {
        return childnumber;
    }

    public void setChildnumber(int childnumber) {
        this.childnumber = childnumber;
    }

    public void getChildDetails() {
        System.out.println("Parent Number: " + getParentnumber());
        System.out.println("Child Number: " + getChildnumber());
    }
}
