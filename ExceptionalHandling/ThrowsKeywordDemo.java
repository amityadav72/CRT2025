package CRT2025.ExceptionalHandling;

public class ThrowsKeywordDemo {
    public void testException()  throws ArithmeticException, ArrayIndexOutOfBoundsException{
        int a = 10/0;
        throw new ArrayIndexOutOfBoundsException("Division by zero");
    }
    public static void main(String[] args) {
        System.out.println("Inside the throws keyword demo");

        ThrowsKeywordDemo obj = new ThrowsKeywordDemo();
        try {
            obj.testException();

        }catch(Exception ex){
            System.out.println("Exception Handled");
        }
    }
}