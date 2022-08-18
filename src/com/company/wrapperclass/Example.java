package com.company.wrapperclass;

public class Example {

    public static void main(String[] args)
    {
        Integer I = Integer.valueOf("5");
        System.out.println(I);

        Double D = Double.valueOf("10.0");
        System.out.println(D);

        Boolean B = Boolean.valueOf("true");
        System.out.println(B);

        // Here we will get RuntimeException
        Integer I1 = Integer.valueOf("five");
    }
}