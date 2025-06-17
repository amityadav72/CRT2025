package com.pote.crt2025.Day6;

public class ChangeDataMember {

    static int rateofInterest = 10;


    ChangeDataMember(int rateofInterest){
        this.rateofInterest = rateofInterest*10;
    }
    public static void main(String[] args) {
        ChangeDataMember cc = new ChangeDataMember(rateofInterest);
        System.out.println("Rate of Interest :"+rateofInterest);



    }
}