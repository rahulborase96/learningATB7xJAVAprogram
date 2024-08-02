package ex_21072024;

import java.util.Scanner;

public class lab098 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc.nextInt();


        int result1 = sum(num1,num2);
        System.out.println("sum of -> "+result1);
        int result2 = sub(num1,num2);
        System.out.println("sum of -> "+result2);
        int result3 = mul(num1,num2);
        System.out.println("sum of -> "+result3);
    }
static int sum(int num1,int num2){
        return(num1+num2);
}
static int sub(int num1,int num2){
        return(num1-num2);
}
static int mul(int num1,int num2){
        return(num1*num2);
}


}

