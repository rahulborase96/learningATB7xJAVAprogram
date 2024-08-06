package ex_250QaS;

import java.util.Scanner;

public class P002_II {
    public static void main(String[] args) {
        // table of input number

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("....table as below......");

        for (int i = 1; i<=10; i++){

            System.out.println( num+"x"+i+"="+num*i);
        }
    }

}
