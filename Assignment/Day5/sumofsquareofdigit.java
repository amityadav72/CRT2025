package com.pote.crt2025.Assignment.Day5;

import java.util.Scanner;

public class sumofsquareofdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int original = number;

        // Calculate sum of squares of digits
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit;
            number = number / 10;
        }

        System.out.println("Sum of squares of digits of " + original + " is: " + sum);
        scanner.close();
    }
}
