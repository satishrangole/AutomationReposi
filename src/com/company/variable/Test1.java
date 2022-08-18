package com.company.variable;

public class Test1 {

    static {
        int a = 20;
        System.out.println("static block");
    }
    public void method1(){
        System.out.println("non static method1");
    }

    public static void method2(){
        System.out.println("static method");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        method2();
        t.method1();
    }
}
