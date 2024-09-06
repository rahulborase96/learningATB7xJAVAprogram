package august.ex_18082024;

public class lab222 {
    public static void main(String[] args) {
        //throw
        //Custom Exception
        Bank sbi = new Bank("INR ", 10);
//        Bank cbi = new Bank("INR", 400);
//Integer total = sbi.add(cbi);
//        System.out.println(total);


        Bank DEna = new Bank("bhat ", 40);
        Integer total2 = sbi.add(DEna);
        System.out.println(total2);

    }
}
