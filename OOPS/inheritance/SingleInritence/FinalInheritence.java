package CRT2025.OOPS.inheritance.SingleInritence;

public class FinalInheritence {
    final int num = 10;
    int num =20;// issue due to can assign the value again because of final

    public void testFinal() {
        System.out.println("This is a final method");
    }
}
 class New1 extends FinalInheritence {
    //int num=20;
    int num = super.num * 10;  // Child class variable shadows parent
}

 class mainclass {
    public static void main(String[] args) {
        New1 obj = new New1();
        obj.testFinal();
        System.out.println("Final num: " + obj.num);
    }
}
