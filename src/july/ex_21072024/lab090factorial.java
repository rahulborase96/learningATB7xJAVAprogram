package july.ex_21072024;

import java.util.Scanner;

public class lab090factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of factorial");
    int num = sc.nextInt();
    int fact = 1;
  for (int i = 1; i<= num; i++) {

      fact = fact * i;

  }
        System.out.println(fact);
    }



}
