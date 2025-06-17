package com.pote.crt2025.Day6;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is a palindrome:");
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;

        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }

        if (original == reverse) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
