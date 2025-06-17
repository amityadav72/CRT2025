package com.pote.crt2025.Day5;

import java.util.Scanner;
public class Whiledemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i=1;
        int sum=0;
        while(i<=50){
            sum=sum+i;
            i++;

        }
        System.out.println(sum);
        sc.close();
    }


}
