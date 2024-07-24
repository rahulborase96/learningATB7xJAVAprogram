package ex_20072024;

import java.util.Scanner;

public class lab071vowel {
    public static void main(String[] args) {
        // take user input as  char and tell the user if it is vowel
        //aeiou
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the char,i will tell you,If it is vowel or Not");
         char alphabet =sc.next().charAt(0);
        System.out.println(alphabet);

         switch (alphabet){
             case 'a','e','i','o','u':
                 System.out.println("It is vowel");
                 break;
             default:
                 System.out.println("it is not vowel, it is consonant");
         }


        }
    }



