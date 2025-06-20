package CRT2025.ExceptionalHandling;

public class HandleCustomException {
    public static void main(String[] args) {

        try{
            throw new CustomExceptionDemo("Custom Exception");
        }catch(CustomExceptionDemo e){
            System.out.println("Exception Message: " + e.getMessage());
            System.out.println("Custom Exception Handled");
        }
    }
}
