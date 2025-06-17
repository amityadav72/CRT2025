package com.pote.crt2025.Day8.Array;

public class arraydemo {
    int[] arr = new int[5];

    public arraydemo() {
        System.out.println("Length is : " + arr.length);
        arr = new int[]{10,20,30,40,50};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        arraydemo demo = new arraydemo();
    }
}