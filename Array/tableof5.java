package com.pote.crt2025.Day8.Array;

public class tableof5 {
    public static void main(String[] args) {
        int[] arr =new int[11];
        for(int i=1; i<arr.length; i++){
            arr[i]=i*5;
            System.out.println("5*"+ i + "=" +  arr[i]);
        }

    }
}
