package july.ex_20072024;

import java.util.Scanner;

public class lab076vowel_if_else {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the char,i will tell you,If it is vowel or Not");
        char ch =sc.next().charAt(0);
        System.out.println(ch);


        if (ch == 'a' || ch == 'e' || ch =='i' || ch== 'o' || ch == 'u')
        {
            System.out.println( "It is vowel");

        }else {
            System.out.println("It is consonant");
        }

    }


}
