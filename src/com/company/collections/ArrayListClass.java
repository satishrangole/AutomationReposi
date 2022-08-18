package com.company.collections;


import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add("Manager");
        arrayList.add("Employee");
        arrayList.add("Clerk");
        arrayList.add("Manager");
        arrayList.add("Clerk");

        arrayList.add("null");
        arrayList.add("True");
        arrayList.add(500);
        arrayList.add('P');
        arrayList.add("False");
        arrayList.add(9.9f);

        System.out.println(arrayList.get(5));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.remove(8));
        System.out.println(arrayList.size());
        System.out.println(arrayList.add(20));
    }

}