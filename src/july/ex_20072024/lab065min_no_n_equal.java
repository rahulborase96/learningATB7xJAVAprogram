package july.ex_20072024;

import java.util.Scanner;

public class lab065min_no_n_equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1");
int num1 = sc.nextInt();
        System.out.println("enter the num2");
        int num2 = sc.nextInt();
        if (num1 < num2){
            System.out.println(num1);
        } else if (num1 > num2) {
            System.out.println(num2);

        }else{
            System.out.println("equal");
        }

    }
}
