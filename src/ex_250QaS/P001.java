package ex_250QaS;

import java.util.Scanner;

public class P001 {
    public static void main(String[] args) {
        //✅ How to Take Input from Users?
        //You can take input from users using the Scanner class
       // name, mobile no. and age
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter your mobile number");
        String mob_no = sc.next();
        System.out.println("...............Your datails.....................");
//        System.out.println("my name is ->" + name);
//        System.out.println("my age is->" +age);
//        System.out.println("my mobile number is->" + mob_no);
        System.out.println("my name is  " + name +" my age is " +age + " and my mobile number is " + mob_no);

    }
}
