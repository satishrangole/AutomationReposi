package com.company.zclassdemo;

public class ExceptionHandling {
    public static void main(String[] args){
        try {
        try {
            int[] a = {1, 2, 3};
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println("welcome java");
        }
        System.out.println(4 / 0);
    }     catch (ArithmeticException e)
    {
            System.out.println("ArithmeticException : divide by 0");
        }
    }

}