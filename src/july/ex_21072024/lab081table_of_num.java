package july.ex_21072024;

import java.util.Scanner;

public class lab081table_of_num {
    public static void main(String[] args) {
//        //table of numbers
            Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of table ");

        int number = sc.nextInt();
        System.out.println("table as below");

        for (int i = 1; i <= 10; i++) {
            int result = number *i;
            System.out.println(result);
        }

    }
}
