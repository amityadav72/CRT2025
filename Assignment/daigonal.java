package com.pote.crt2025.Day7;

public class daigonal {
    public static void main(String[] args) {
        int a=3;

        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){

                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
