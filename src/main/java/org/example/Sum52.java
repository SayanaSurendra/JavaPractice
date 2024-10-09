package org.example;

import java.util.Scanner;

public class Sum52 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Input first number:");
        int a=in.nextInt();


        System.out.println("Input second number:");
        int b=in.nextInt();

        System.out.println("Input third number:");
        int c=in.nextInt();

        System.out.println("The result is;"+ sum(a,b,c));


    }

    private static boolean sum(int a, int b,int c) {
        return(((a+b)==c) || ((a+c)==b) || ((c+b)==a)) ;
    }
}
