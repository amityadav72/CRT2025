package com.pote.crt2025.Day5;

import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to be reversed");
        int n = sc.nextInt();

        int reverse=0;

        while(n!=0){
            reverse=reverse*10+n%10;
            n=n/10;

        }

        System.out.println("The reversed integer is:"+reverse);
    }
}
