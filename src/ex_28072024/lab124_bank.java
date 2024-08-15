package ex_28072024;

public class lab124_bank {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.name ="SBI";
        bank.balance=100;
        bank.withdraw();

        Bank bank2=new Bank();
        bank2.name = "HDFC";
        bank2.deposit();
        System.out.println(bank.name);
        System.out.println(bank.balance);
        System.out.println(bank2.balance);
        System.out.println(bank2.name);
    }
}
