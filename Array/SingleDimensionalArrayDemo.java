package com.pote.crt2025.Day8.Array;

public class SingleDimensionalArrayDemo {
    int[] arr = new int[5];

    public SingleDimensionalArrayDemo() {
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
    }

    public static void main(String[] args) {
        SingleDimensionalArrayDemo demo = new SingleDimensionalArrayDemo();
        for (int ele : demo.arr) {
            System.out.println(ele);
        }
    }
}