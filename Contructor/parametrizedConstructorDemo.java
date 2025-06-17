package com.pote.crt2025.Day6;

public class parametrizedConstructorDemo {

    parametrizedConstructorDemo(int a, int b){
        System.out.println("Inside the parametrizedConstructorDemo");
    }

    public static void main(String[] args) {
        parametrizedConstructorDemo obj = new parametrizedConstructorDemo(10,20);

    }
}
