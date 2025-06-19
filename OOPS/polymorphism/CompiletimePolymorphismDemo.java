package CRT2025.OOPS.polymorphism;

import java.util.Scanner;

public class CompiletimePolymorphismDemo {

    public void addition(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    public void addition(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    public void addition(int a, double b) {
        System.out.println("Sum of int and double: " + (a + b));
    }

    public void addition(double a, int b) {
        System.out.println("Sum of double and int: " + (a + b));
    }

    public void addition(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CompiletimePolymorphismDemo obj = new CompiletimePolymorphismDemo();

        System.out.print("Enter first number (int): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (int): ");
        int b = sc.nextInt();

        System.out.print("Enter third number (int): ");
        int c = sc.nextInt();

        obj.addition(a, b);             // int, int
        obj.addition(a, (double) b);    // int, double
        obj.addition((double) a, b);    // double, int
        obj.addition((double) a, (double) b);
        obj.addition(a,b,c );// double, double
    }
}
