package com.pote.crt2025.Day6;

public class questionContructor {

    int a;
    int b;
    public questionContructor(double a, double b) {
        System.out.println("paramatrizedconstructor");

    }

    public questionContructor(int a, int b) {
        System.out.println("paramatrizedconstructor1");

    }

    public questionContructor(double a, int b) {
        System.out.println("paramatrizedconstructor2");

    }

    public static void main(String[] args) {
        paramatrizedconstructor obj = new paramatrizedconstructor(1, 2);
    }
}
