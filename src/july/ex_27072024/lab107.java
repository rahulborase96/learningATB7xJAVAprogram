package july.ex_27072024;

import java.util.Scanner;

public class lab107 {
    public static void main(String[] args) {
        //average of sub

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the marks of sub1");
         marks[0] = sc.nextFloat();
        System.out.println("Enter the marks of sub2");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the marks of sub3");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the marks of sub4");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the marks of sub5");
        marks[4] = sc.nextFloat();

        float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Avg of marks ->" + avg);
    }


}
