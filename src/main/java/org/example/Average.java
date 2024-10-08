package org.example;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=in.nextInt();

        System.out.println("Enter Second number:");
        int b=in.nextInt();


        System.out.println("Enter third number:");
        int c=in.nextInt();

        System.out.println("Average::"+(a+b+c)/3);

    }
}
