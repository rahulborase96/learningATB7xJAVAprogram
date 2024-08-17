package august;

import java.util.Scanner;

public class Bankaccount_lab129 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your bank name");
        String bname = sc.next();
        System.out.println("Enter your bank bal");
        int bal = sc.nextInt();
        System.out.println("Enter your bank code");
        String bcode = sc.next();

        Bankaccount bank =new Bankaccount(bname,bal,bcode);
        bank.PrintDetails();

    sc.close();

    }


}
