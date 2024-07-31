package ex_20072024;

import java.util.Scanner;

public class lab078Fizzbuzz {
    public static void main(String[] args) {

//        ✅ FizzBuzz Test:
//        Write a program that prints numbers from 1 to 100.
//         However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5,
//         print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = scanner.nextInt();
        if (input % 3 == 0 && input % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (input % 3 == 0) {
            System.out.println("Fizz");
        } else if (input % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(input);
        }
//    }
    }
}
