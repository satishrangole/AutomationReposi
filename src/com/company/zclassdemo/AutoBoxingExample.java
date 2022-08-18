package com.company.zclassdemo;

public class AutoBoxingExample {

    public static void main(String[] args) {
        int a = 7;
        float f = 10.35f;
        String s = "welcome";


        Integer I = a;
        Float Float = f;
        String string = s;

        System.out.println(I); //autoboxing
        System.out.println(f); //autoboxing
        System.out.println(s); //autoboxing

    }
}
