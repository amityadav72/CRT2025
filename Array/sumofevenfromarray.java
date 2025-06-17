package com.pote.crt2025.Day8.Array;

public class sumofevenfromarray {

    public static void main(String[] args) {
        int[] arr = {10,40,60,70,80,100,4,1,2};
        int sum=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of even number from array :" + sum);
    }
}
