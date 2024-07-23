package ex_20072024;

import java.util.Scanner;

public class lab063Odd_Even_num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num");
 int user_input = sc.nextInt();
        System.out.println(user_input);
             if (user_input%2==0)
        {
            System.out.println("Even");
        }else
        {
            System.out.println("Odd");
        }
    }
}
