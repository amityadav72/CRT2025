package com.pote.crt2025.Day6;

public class paramatrizedconstructor {
    int a;
    int b;
    public paramatrizedconstructor(double a, double b) {
        System.out.println("paramatrizedconstructor");
    }

    public static void main(String[] args) {
        paramatrizedconstructor obj = new paramatrizedconstructor(1, 2);
    }
}
