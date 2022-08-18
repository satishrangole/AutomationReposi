package com.company.abstraction;

public class Demo  extends BasicDemoClass {

    Demo(int a, int b, int c, int d){
        super(a,b,c,d);
    }

    public void method3(){

        System.out.println("child class");
    }

    public static void main(String[] args) {
        Demo demo = new Demo(10,20,30,40);
    }


}
