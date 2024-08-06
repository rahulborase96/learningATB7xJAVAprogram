package ex_250QaS;

import java.util.Scanner;

public class P006_triangle_classifier {
    public static void main(String[] args) {
// ✅ Triangle Classifier:
//Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides,
// determine if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal),
// or scalene (no sides are equal).
// Use an if-else statement to classify the triangle
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter side1");
        float side1 = sc.nextFloat();
        System.out.println("enter side2");
        float side2 = sc.nextFloat();
        System.out.println("enter side3");
        float side3 = sc.nextFloat();
        if (side1==side2 && side2==side3){
            System.out.println("triangle is equilateral");
        } else if (side1==side2 || side2==side3 || side3==side1) {
            System.out.println("triangle is isosceles");
        }else
            System.out.println("triangle is scalene");
            }
}
