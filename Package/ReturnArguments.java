package com.pote.crt2025.Day5.Package;

public class ReturnArguments {
    public static void main(String[] args) {
        ReturnArguments r = new ReturnArguments();
        int returnData = r.returnValue();
        System.out.println(returnData);
    }

    public int returnValue() {
        System.out.println("Inside the method");
        return 1;
    }
}
