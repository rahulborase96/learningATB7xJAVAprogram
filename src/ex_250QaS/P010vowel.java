package ex_250QaS;

import java.util.Scanner;

public class P010vowel {
    public static void main(String[] args) {
//✅ Count vowels and consonants in a String
        //a,e,i,o,u
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the alphabet");
        char ch =sc.next().charAt(0);
        char e;
        char i;
        char a;
        char o;
        char u;
if (ch=='a' || ch=='i' ||ch=='e' ||ch=='o' ||ch=='u' ){
    System.out.println("Alphabet is vowel");
}else {
    System.out.println("Alphabet is consonant");
}

    }
}
