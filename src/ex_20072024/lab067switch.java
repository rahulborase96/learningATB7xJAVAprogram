package ex_20072024;

import java.util.Scanner;

public class lab067switch {
    public static void main(String[] args) {
        //week days
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the day 1 to 7 ,and tell mw hwt day it is");
int day = sc.nextInt();

switch (day){
    case 1:
        System.out.println("Mon");
        break;
    case 2:
        System.out.println("Tue");
        break;
    case 3:
        System.out.println("Wed");
        break;
    case 4:
        System.out.println("Thu");
break;
    case 5:
        System.out.println("Fri");
    break;
        case 6:
        System.out.println("Sut");
    break;
        case 7:
        System.out.println("Sun");
break;



}

    }


}
