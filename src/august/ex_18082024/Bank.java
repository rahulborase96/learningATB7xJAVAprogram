package august.ex_18082024;

public class Bank {
        private String currency;
        private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public  Integer add (Bank BankNname){
        if (!BankNname.currency.equalsIgnoreCase("INR"));
        // throw exception that it is not supported - USD, gBP + INR
        try {
            throw new Exception("currency doesn't match");
        } catch (Exception e) {
            System.out.println();
        }
        Integer sum = this.amount + BankNname.amount;
        return sum;
    }
}
