package org.example;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the input string:");
        String s=in.nextLine();
        int i=Integer.parseInt(s);
        System.out.println("The integer value is:"+i);


    }


}
