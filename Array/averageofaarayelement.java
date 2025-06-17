package com.pote.crt2025.Day8.Array;

public class averageofaarayelement {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,80,-10,20,-30,100};
        int sum=0;

        for (int i =0; i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println("Average of Array :" + sum/arr.length);
    }
}
