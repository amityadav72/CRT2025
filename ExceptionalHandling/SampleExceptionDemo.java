package CRT2025.ExceptionalHandling;

public class SampleExceptionDemo {

    public static void main(String[] args) {
        System.out.println("Prepare for Theatre");
        try {
            System.out.println("Travelling to theatre");
            System.out.println("Reach to VMV Chowk");
            System.out.println("Observe the traffic");
            System.out.println("Ask about traffic");
        throw new RuntimeException("Accident : 2hrs");
    }
    catch(Exception ex){
            System.out.println("Take a diversion");
            System.out.println("Exception caught : " + ex.getMessage());
            System.out.println("reached to theatre");

    }
        finally{
            System.out.println("Remove the keys");
        }
    }
}
