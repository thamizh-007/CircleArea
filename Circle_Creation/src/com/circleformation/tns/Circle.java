package com.circleformation.tns;

import java.util.Scanner;

public class Circle {
    // Data members
    private double radius;
    private String color;

    // Method to get input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        
        // Get radius input
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
        
        // Get color input
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter the color of the circle: ");
        color = scanner.nextLine();

        scanner.close();
    }

    // Method to calculate and display the area of the circle
    public void calcArea() {
        double area = Math.PI * radius * radius; // Area formula πr²
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        Circle circle = new Circle();
        
        // Get input and calculate area
        circle.getInput();
        circle.calcArea();
    }
}
