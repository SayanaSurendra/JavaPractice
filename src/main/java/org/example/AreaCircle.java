package org.example;

public class AreaCircle {
    private static final double radius=7.5;

    public static void main(String[] args) {
      // double radius=7.5;

        double area=Math.PI * radius * radius;
        double perimeter=2 * Math.PI * radius;

        System.out.println("Area:"+area);
        System.out.println("Perimeter:"+perimeter);

    }
}
