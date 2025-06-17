package com.pote.crt2025.Day5;
import java.util.Scanner;

public class desc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number2: ");
        int num2 = sc.nextInt();
        int diff = num1 - num2;

        if (diff > 5) {
            System.out.println("The difference is more than 5");
        } else {
            while (num1 < num2) {
                System.out.println("The numbers are: " + num1);
                num1++;
            }
        }
        sc.close();
    }
}
