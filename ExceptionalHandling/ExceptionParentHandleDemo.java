package CRT2025.ExceptionalHandling;

public class ExceptionParentHandleDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20};
        try {
            throw new ArithmeticException();
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Inside the array Exception");
        }
        catch (Exception ex) {
            System.out.println("Runtime Exception ");
        }
    }
}
