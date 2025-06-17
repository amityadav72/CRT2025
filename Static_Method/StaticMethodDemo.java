package com.pote.crt2025.Day6;

public class StaticMethodDemo {
    static int rateofinterest;

    public static void setInterest(int rateofInterest) {
        rateofinterest = rateofInterest;
    }

    public static void main(String[] args) {
        StaticMethodDemo.setInterest(20);
        System.out.println("Rate of Interest :" + rateofinterest);
    }
}
