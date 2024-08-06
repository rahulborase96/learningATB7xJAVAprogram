package ex_250QaS;

import java.util.Scanner;

public class P011prime_number {
    public static void main(String[] args) {
//some valid and invalid test cases for the prime number checker in Java:

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
int num = sc.nextInt();
sc.close();
if (isprime(num)){
    System.out.println(num + " is prime number");
}else {
    System.out.println(num + "it is not prime number");
}
    }
static boolean isprime(int number) {
    if (number <= 1) {
        return false;
    }
    if (number <=3){
        return true;
    }
    if (number % 2==0 || number% 3==0){
return false;
    }
    for (int i=5; i* i <=number; i+=6){
        if (number %i==0||number%(i+2)==0){
            return false;
        }
    }
    return true;
     }
}
