package july.ex_20072024;

import java.util.Scanner;

public class lab075max_num_bet_num {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        System.out.println("enter num3");
        int num3 = sc.nextInt();
        System.out.println("enter num4");
        int num4 = sc.nextInt();
        if (num1 > num2 && num1 >num3 && num1 >num4) {
            System.out.println("max number is->" + num1);
        } else if (num2 >num1 && num2 > num3 && num2> num4) {
            System.out.println("max number is->" + num2);

        }else if (num3 >num1 && num3 > num2 && num3> num4) {
            System.out.println("max number is->" + num3);

        }else {
            System.out.println("max number is->" + num4);

        }


    }

}
