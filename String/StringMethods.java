package com.pote.crt2025.Day8.String;

public class StringMethods {

    public static void main(String[] args) {
        String str = "My Name Is xyz";

        System.out.println(str.toUpperCase());

        String str2 = "My Name Is xyz";
        System.out.println(str2.toLowerCase());

        System.out.println(str2.charAt(5));

        System.out.println("String length : " + str2.length());

        System.out.println("String arr :" + str.toCharArray()); // print the address of the array in hash code


      char [] arr = str.toCharArray();

      for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]);
      }



    }
}
