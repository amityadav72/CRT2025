package com.pote.crt2025.Day8.Array;

public class copyarray {
    public static void main(String[] args) {


        int[] arr = {10,20,30,40,50, 60, 70, 80 ,90, 100};
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int ele : arr2) {
            System.out.println(ele);
        }
    }
}
