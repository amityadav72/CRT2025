package com.pote.crt2025.Day8.Array;

public class reverseofarray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] arr2 =new int[arr.length];

        for(int i=0; i<arr.length; i++){
            arr2[i]=arr[arr.length-1-i];
        }

        for(int i=0; i<arr2.length; i++){

            arr[i]=arr2[i];
            System.out.print(""+ arr[i]+ ",");
        }



    }
}
