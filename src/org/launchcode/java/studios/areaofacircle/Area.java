package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();

        //double areaOfCircle = ( 3.14 * radius * radius);
        System.out.println("The area of a circle of " + radius + " is: " + Circle.getArea(radius) );
    }
}