package org.example;

public class SquareHollowPattern {
    public static void main(String[] args) {
        int n=6;
        printPattern(n);

    }

    private static void printPattern(int n) {
       int row,col;
        for( row=1;row<=n;row++){
            for(col=1;col<=n;col++){
                System.out.print("* ");
            }


       }
        System.out.println();

    }
}
