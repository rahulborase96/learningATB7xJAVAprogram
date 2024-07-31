package ex_21072024;

import java.util.Scanner;

public class lab078leap_year {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if (year%4==0 || year%400==0) {
            System.out.println("its is leap year");
        }else {
            System.out.println("it is not leap year");
        }
    }
}
