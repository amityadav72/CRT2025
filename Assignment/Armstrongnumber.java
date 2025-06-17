package com.pote.crt2025.Day7;

import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower number:");
        int lower = sc.nextInt();
        System.out.println("Enter the upper number:");
        int upper = sc.nextInt();



        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");

        for (int num = lower; num <= upper; num++) {
            int Originalnum = num;
            int digits = String.valueOf(num).length();
            int sum = 0;

            while (Originalnum != 0) {
                int digit = Originalnum % 10;
                sum += Math.pow(digit, digits);
                Originalnum = Originalnum / 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
