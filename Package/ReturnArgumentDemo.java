package com.pote.crt2025.Day5.Package;

import java.util.Scanner;

public class ReturnArgumentDemo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scr.nextInt();

        ReturnArgumentDemo obj = new ReturnArgumentDemo();
       int square=obj.processData(a);
       System.out.println(square);
    }

    public int processData(int a) {
        return (int) Math.pow(a, 2);
    }
}
