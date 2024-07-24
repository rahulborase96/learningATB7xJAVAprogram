package ex_20072024;

import java.util.Scanner;

public class lab074positive_negative {
    public static void main(String[] args) {
        //program to check number is positive ,negative or zero
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if (number>0 ){
            System.out.println("Number is postive");
        } else if (number < 0) {
            System.out.println( "Number is negative");

        } else if (number ==0) {
            System.out.println("number is zero");
        }


    }


}
