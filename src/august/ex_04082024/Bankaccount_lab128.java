package august.ex_04082024;

public class Bankaccount_lab128 {
    public static void main(String[] args) {
        Bankaccount bank = new Bankaccount();

        System.out.println(bank.bankName);
        System.out.println(bank.balance);
        System.out.println(bank.BankCode);

        Bankaccount bank2 =new Bankaccount("CBI",12546,"CBI002");
        System.out.println(bank2.BankCode);
        System.out.println(bank2.balance);
        System.out.println(bank2.bankName);

        System.out.println(".........................");
        // or in simple way
        bank.PrintDetails();
        System.out.println(".........................");

        bank2.PrintDetails();
    }
}