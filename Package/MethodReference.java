package com.pote.crt2025.Day5.Package;

public class MethodReference {

    public void testMethod(int a) {
        System.out.println("runtime argument:: " + a);
    }

    public static void main(String[] args) {
        MethodReference m = new MethodReference();
        m.testMethod(10);
    }
}
