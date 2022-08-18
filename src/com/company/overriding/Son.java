package com.company.overriding;



public class Son extends FatherMother {


      @Override
     public void marriage() {
        System.out.println("I will marry with own choose girl");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.marriage();
    }

}