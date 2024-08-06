package ex_250QaS;

import java.util.Scanner;

public class P010_II {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the alphabet");
        char ch =sc.next().charAt(0);
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Alphabet is vowel");
                break;
            default:
                System.out.println("Alphabet is consonants");
        }
           }

}
