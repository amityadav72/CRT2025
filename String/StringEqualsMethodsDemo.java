package com.pote.crt2025.Day8.String;

public class StringEqualsMethodsDemo {

    public static void main(String[] args) {

        String strlitobj ="test"; // string pool
        String strlitobjNew = "test new";
        String newrefstrlitobj = "test";
        String strnewobjdata = new String("test");
        String strnewobjectdata = new String("test"); // heap memory

        System.out.println(strlitobj==strlitobjNew);// check the reference string pool is not equal to heap memory it will return false
        System.out.println(strlitobj.equals(strlitobjNew)); // check content as both are test then return true
        System.out.println(strlitobj==newrefstrlitobj);
        System.out.println(strlitobj.equals(newrefstrlitobj)); // check the content
        System.out.println(strnewobjdata==strnewobjectdata);
        System.out.println(strnewobjdata.equals(strnewobjectdata));
    }
}
