package com.company.variable;

public class Test {

    int a = 10;
    static int b = 20;
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(b);
    }
}
