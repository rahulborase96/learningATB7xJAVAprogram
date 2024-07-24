package ex_20072024;

import java.util.Scanner;

public class lab072 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the item code");

        int item_code = sc.nextInt();

        switch (item_code){
            case 001,002,003,004,005 -> System.out.println("It is mechanical device");
        case 006,007,010 ->  System.out.println("It is Electronic device");
            default -> System.out.println("no data found");

        }
    }
}
