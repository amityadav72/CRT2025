package com.pote.crt2025.Day5;

public class pattern {
    public static void main(String[] args) {
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
}
