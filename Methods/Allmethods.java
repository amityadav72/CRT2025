package com.pote.crt2025.Day7;


// Its not feasible
public class Allmethods {
    static int a =10;
    static int b =20;

    public static void addition(int a,int b){
        System.out.println("Addition Method" + (a+b));

    }

    public static void sub(int a,int b){
        System.out.println("Substraction Method" + (a-b));

    }


    public static void division(int a,int b){
        System.out.println("Division Method" + (a/b));

    }



    public static void main(String[] args) {
        addition(a,b);
        sub(a,b);
        division(a,b);

    }
}
