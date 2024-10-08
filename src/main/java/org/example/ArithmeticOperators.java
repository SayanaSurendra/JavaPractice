package org.example;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=in.nextInt();

        System.out.println("Enter second number:");
        int b=in.nextInt();

        System.out.println(a +"+"+ b +"="+(a+b));

        System.out.println(a +"-"+ b +"="+(a-b));

        System.out.println(a +"x"+ b +"="+(a*b));

        System.out.println(a +"/"+ b +"="+(a/b));

        System.out.println(a +"mod"+" 125" +
                "" + b +"="+(a%b));






    }
}
