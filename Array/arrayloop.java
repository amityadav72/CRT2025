package com.pote.crt2025.Day8.Array;

public class arrayloop {

    int[] arr = new int[5];

    public arrayloop() {

        System.out.println("Length is : " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i]=10;
        }
    }

    public static void main(String[] args) {
        arrayloop demo = new arrayloop();
        for (int ele : demo.arr) {
            System.out.println(ele);
        }
    }
}
