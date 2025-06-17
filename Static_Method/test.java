package com.pote.crt2025.Day6;

public class test {
    static int a = 10;
    public static void main(String[] args) {


        System.out.println(a);

        test ob = new test();
        ob.show();
    }

    public void show() {

        a= 20;
        System.out.println(a);
    }
}