package com.pote.crt2025.Day5;

public class numberpattern {
    public static void main(String[] args) {

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                if(i%2==1) {
                    System.out.print("*");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
