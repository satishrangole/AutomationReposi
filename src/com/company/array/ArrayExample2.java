package com.company.array;

public class ArrayExample2 {

    public static void main(String[] args) {
        int[][] x = new int[][]{{10, 20}, {30, 40}};

        for(int i =0; i<=x.length-1; i++){
            for(int j=0; j<=x.length-1; j++){
                System.out.print(x[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}