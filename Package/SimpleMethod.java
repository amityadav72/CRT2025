package com.pote.crt2025.Day5.Package;

public class SimpleMethod {

    public void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2() {
        int rows = 3;
        int num = 2;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print((num - 1) + " ");
                } else {
                    System.out.print(num + " ");
                }
                num += 2;
            }
            System.out.println();
        }
    }

    public void pattern3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SimpleMethod obj = new SimpleMethod();

        obj.pattern1();
        System.out.println();

        obj.pattern2();
        System.out.println();

        obj.pattern3();
    }
}
