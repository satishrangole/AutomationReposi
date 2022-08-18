package com.company.overloading;

public class Test1 {

    public void addition(int a, int b){
        System.out.println(a+b);
    }

    public void addition(int a, int b,int c){
        System.out.println(a+b+c);
    }

    public void addition(float a,float b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.addition(20,30);
        t.addition(10,40,50);
        t.addition(20.15f,10.15f);

    }
}
