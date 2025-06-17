package com.pote.crt2025.Day8.Array;

public class sumofdigitofarray {

    public static void main(String[] args) {
        int[] arr = {10, 40, 60, 70, 80, 100, 4, 1, 2};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while (num != 0) {
                sum += num % 10;
                num = num / 10;
            }
        }

        System.out.println("Sum of digit of array: " + sum);
    }
}
