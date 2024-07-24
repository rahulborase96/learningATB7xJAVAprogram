package ex_20072024;

import java.util.Scanner;

public class lab077triangle_classifier {
    public static void main(String[] args) {
        //✅ Triangle Classifier:
// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length os side1");
        double side1 = sc.nextDouble();
        System.out.println("enter the length os side2");
        double side2 = sc.nextDouble();
        System.out.println("enter the length os side3");
        double side3 = sc.nextDouble();

        // side1 ==side2 || side2==side3 -> equilateral triangle
        // side1 ==side2 ||side2 ==side3  || side1 ==side3-> isosceles
        // default scalene

        if (side1 == side2 && side2 == side3){
            System.out.println("trinle is equilateral");
        } else if (side1 ==side2 || side2 ==side3 || side1 == side3) {
            System.out.println("triangle is isosceles");

        }else {
            System.out.println("triangle is scalene ");
        }

    }
}
