package ex_250QaS;

import java.util.Scanner;

public class P005leap_year_checker {
    public static void main(String[] args) {
      /*  ✅ Leap Year Checker:
        Create a program that determines whether a given year is a leap year.
            A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
/     * Use an if-else statement to make this determination.
*/
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
