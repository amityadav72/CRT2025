package com.pote.crt2025.Day8.String;

public class NumberofSpacesinString {

    public static void main(String[] args) {

        String str = "India is my country. All Indians are my brother and sister";

        int space =0;

        for(int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == ' ') {
                space++;
            }
        }
        System.out.println("Number of spaces in the string is : " + space);
    }
}
