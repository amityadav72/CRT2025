package CRT2025.Practice;

import java.util.Scanner;

public class Calculaterusingmethod {

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculaterusingmethod obj = new Calculaterusingmethod();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEnter the first number:");
            double a = sc.nextDouble();

            System.out.println("Enter the second number:");
            double b = sc.nextDouble();

            System.out.println("Enter the choice:");
            System.out.println("1 for Addition");
            System.out.println("2 for Subtraction");
            System.out.println("3 for Multiplication");
            System.out.println("4 for Division");
            System.out.println("5 to Exit");
            choice = sc.nextInt(); // ✅ Get user choice

            switch (choice) {
                case 1:
                    System.out.println("Addition: " + obj.add(a, b));
                    break;
                case 2:
                    System.out.println("Subtraction: " + obj.sub(a, b));
                    break;
                case 3:
                    System.out.println("Multiplication: " + obj.mul(a, b));
                    break;
                case 4:
                    System.out.println("Division: " + obj.div(a, b));
                    break;
                case 5:
                    System.out.println("Exiting the calculator");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        } while (choice != 5);

        sc.close();
    }
}
