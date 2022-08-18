package com.company.abstraction;

public abstract class BasicDemoClass {

        int a, b, c, d;

        BasicDemoClass(int a, int b,int c, int d){
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;

        }
        public void nonabstractmethod() {
            System.out.println("non abstract method");
        }

        public static void method1(){
            System.out.println("method1");
        }

        public final void method2(){
            System.out.println("method2");
        }

        public abstract void method3();

        public static void main(String[] args) {

        }
}
