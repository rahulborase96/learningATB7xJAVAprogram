package ex_250QaS;

import java.util.Scanner;

public class P004Grade_calculator {
    public static void main(String[] args) {
//  Write a program that calculates and displays the letter grade for a given numerical score
//  (e.g., A, B, C, D, or F) based on the following grading scale:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        double score = sc.nextDouble();
        if (score <= 100 && score > 89) {
            System.out.println("your grade is-> A");
        } else if (score <= 89 && score > 79) {
            System.out.println("your grade is -> B");
        } else if (score <= 79 && score > 69) {
            System.out.println("your grade is -> C");
        } else if (score <= 69 && score > 59) {
            System.out.println("your grade is -> D");
        } else if (score <= 59 && score > 0) {
            System.out.println("your grade is -> F");

        }
    }}
