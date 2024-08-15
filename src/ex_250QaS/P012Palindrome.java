package ex_250QaS;

import java.util.Scanner;

public class P012Palindrome {
    public static void main(String[] args) {
//        ✅ Palindrome Checker:
// Create a program that checks whether a given string is a palindrome.
// A palindrome is a word or phrase that reads the same backward as forward (ignoring spaces, punctuation, and capitalization).
// Use an if-else statement to determine if the string is a palindrome.
    Scanner sc = new Scanner(System.in);
        System.out.println("ente the word");
        String word = sc.next();
        char start = word.charAt(0);
        char end = Character.valueOf(word.charAt(word.length()-1));
    if (start != end){
        System.out.println("not palindrome");

    }else {
        System.out.println("palindrome");
    }
    }
}
