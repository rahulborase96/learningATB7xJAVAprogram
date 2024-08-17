package august;

public class Bankaccount {
    String bankName;
    int balance;
    String BankCode;
//DC
    Bankaccount() {
        bankName="SBI";
         balance =120000000;
         BankCode= "SBI001";
    }
//PC  3 arguments
     Bankaccount(String bName,int bal,String bCode){
    this.balance=bal;
    this.BankCode=bCode;
    this.bankName=bName;
    }


    void PrintDetails(){
        System.out.println("Bank name ->" +bankName);
        System.out.println("Bank balance ->" +balance);
        System.out.println("Bank code  ->" +BankCode);
    }
}