package com.pote.crt2025.Day6;

public class ParamatrizedConstructorThis {
    private int a;
   private int b;


    ParamatrizedConstructorThis(int c, int d) {
        this.a=a;
        this.b=b;

    }

    public void printvalue(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        ParamatrizedConstructorThis obj =new ParamatrizedConstructorThis(10,20);
        obj.printvalue();
    }
}
