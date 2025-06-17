package com.pote.crt2025.Day7.garbagecollection;

public  class StaticClassDemo {

    public static int demo=10;
    public static class NestedStaticClass{

        public void testData(){
            System.out.println("testData");
        }

    }


    public static void main(String[] args) {
        StaticClassDemo.NestedStaticClass nestobj=new StaticClassDemo.NestedStaticClass();
        nestobj.testData();

    }
}
