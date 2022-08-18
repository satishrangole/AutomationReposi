package com.company.zclassdemo;

public class BasicJavaCoding {

    public static void main (String[] args) {
        try{
            System.out.println(30/0);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finally executed");
        }

        System.out.println("end");
    }
}