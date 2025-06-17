package com.pote.crt2025.Day7.garbagecollection;

public class GarbageCollectionExplicit {
    public void test(){
        System.out.println("test method ");


    }

    protected void finalize() throws Throwable {
        System.out.println("finalize method ");
    }

    public static void main(String[] args) {

        GarbageCollectionExplicit obj = new GarbageCollectionExplicit();
        obj.test();
        obj=null;

        System.gc();
    }
}
