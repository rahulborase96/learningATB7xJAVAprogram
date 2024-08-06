package ex_250QaS;

public class P004_II {
    public static void main(String[] args) {
        //  Write a program that calculates and displays the letter grade for a given numerical score
//  (e.g., A, B, C, D, or F) based on the following grading scale:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59

        int score = 85;
        char grade;
        if (score <= 100 && score > 89) {
            grade = 'A';
        } else if (score <= 89 && score > 79) {
            grade = 'B';
        } else if (score <= 79 && score > 69) {
            grade = 'C';
        } else if (score <= 69 && score > 59) {
            grade = 'D';
        } else if (score <= 59 && score > 0) {
        grade = 'F';
            System.out.println("your grade is->"+ grade);
    }}

    }

