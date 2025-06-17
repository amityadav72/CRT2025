package com.pote.crt2025.Day8.Array;

public class SingleDimensionArrayloop {
    int[] arr = new int[5];

    public SingleDimensionArrayloop() {

        System.out.println("Length is : " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i]=10;
        }
    }

    public static void main(String[] args) {
        SingleDimensionArrayloop demo = new SingleDimensionArrayloop();
        for (int ele : demo.arr) {
            System.out.println(ele);
        }
    }
}