package com.company.array;

public class BasicExample {

    public static void main(String[] args) {
        
        int [] z = new int[]{10,20,30,40,50,60,70,80};

//        for (int i=1; i<z.length; i++){
//            System.out.println(z[i]);              //normal array
//        }
        for (int i: z){
            System.out.println(i);     //for each array

    }

    }

    
}
