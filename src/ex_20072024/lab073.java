package ex_20072024;

import java.util.Scanner;

public class lab073 {
    public static void main(String[] args) {

        //write a program give Your name ,age,salary

        Scanner sc = new Scanner(System.in);
        System.out.println("enter yor name");
String name = sc.next();
        System.out.println("Enter your age");
    int age = sc.nextInt();
        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        System.out.println("your name ->" + name);
        System.out.println("your age ->" + age);
        System.out.println("your salary->"+ salary);
sc.close();
    }







}
