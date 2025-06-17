package com.pote.crt2025.Day6;

import java.util.Scanner;

public class calculatorswitch {

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
        calculatorswitch obj = new calculatorswitch();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Enter two numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        do {


            System.out.println("Enter the choice:");
            System.out.println("1 for Addition");
            System.out.println("2 for Subtraction");
            System.out.println("3 for Multiplication");
            System.out.println("4 for Division");
            System.out.println("5 to Exit");
            choice = sc.nextInt();

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
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:

                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                    choice=5;
            }
        } while (choice != 5);

        sc.close();
    }
}
