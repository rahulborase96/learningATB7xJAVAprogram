package ex_20072024;

import java.util.Scanner;

public class lab070 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter item code");
        int item_code = sc.nextInt();
                switch (item_code){
//            case 001, 002, 003, 004,005,016,017,020:
//                System.out.println("it is electronic device");
//        break;
//            case 006,007,010,011,012,013,014,015:
//                System.out.println("it is mechanical device");
                    case 008 ->
                System.out.println("it is electronic device");
        break;
            default:
                System.out.println("Wrong item code");
        }

    }
}
