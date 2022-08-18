package com.company.constructor;

public class ThisKeyword {
    int a;
    int b;
    String s;

    ThisKeyword(int a,int b){
      this.a = a;
         this.b = b;
    }

    public void method1(){
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        ThisKeyword ThisKeyword = new ThisKeyword(20,30);
        ThisKeyword.method1();
    }
}

