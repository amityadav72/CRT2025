package com.pote.crt2025.Day6;

public class StaticInitializationBlockDemo {

    static int rateofinterest;
    public static void main(String[] args) {
        System.out.println("Inside the main method");
        System.out.println("rateofinterest = " + rateofinterest);
    }
        static {
            System.out.println("Inside the static initialization block");
            rateofinterest = 20;

    }
}
