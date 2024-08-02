package ex_27072024;
import java.util.Scanner;
public class lab109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];

        // Loop through each subject to get the marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of " + (i+1));
            marks[i] = sc.nextFloat();
        }
    }
    }
