package CRT2025.Practice;

public class CalculationExceptionHandling {

    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void sub(int a, int b){
        System.out.println(a-b);
    }
    public void mul(int a, int b){
        System.out.println(a*b);
    }
    public void div(int a, int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        CalculationExceptionHandling obj = new CalculationExceptionHandling();
        int FirstNumber =Integer.parseInt(args[0]);
        int SecondNumber =Integer.parseInt(args[1]);

        obj.add(FirstNumber,SecondNumber);
        obj.sub(FirstNumber,SecondNumber);
        obj.mul(FirstNumber,SecondNumber);
        obj.div(FirstNumber,SecondNumber);
    }
}
