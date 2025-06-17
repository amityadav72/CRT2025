package com.pote.crt2025.Day8.String;

public class SpaceRemovalDemo {

    public static void main(String[] args) {

        String username = "xyz@gmail.com";
        String InputUsername=" xyz@gmail.com";
        System.out.println(username.equals(InputUsername)); // return false because InputUsername having extra space
        System.out.println(username.trim().equals(InputUsername.trim()));// remove the extra space from both side
    }
}
