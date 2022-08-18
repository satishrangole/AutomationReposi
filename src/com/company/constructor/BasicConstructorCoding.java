package com.company.constructor;

import java.util.Collections;

public class BasicConstructorCoding {

    int a;
    String s;
    BasicConstructorCoding(){
        System.out.println("Default Constructor");        //default constructor
    }
    BasicConstructorCoding(int b,int c) {
        System.out.println("Parameterized constructor");    //Parameterized constructor
        System.out.println(b+" "+c);


    }

    public static void main(String[] args) {
        BasicConstructorCoding BasicConstructorCoding = new BasicConstructorCoding();
        System.out.println(BasicConstructorCoding.a);
        System.out.println(BasicConstructorCoding.s);

        BasicConstructorCoding BasicConstructorCoding1 = new BasicConstructorCoding(10,20);
        BasicConstructorCoding BasicConstructorCoding2 = new BasicConstructorCoding(40,50);
    }

}
