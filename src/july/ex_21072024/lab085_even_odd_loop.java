package july.ex_21072024;

public class lab085_even_odd_loop {
    public static void main(String[] args) {
        for (int a=0; a<=50; a++){
            if (a%2==0){
                System.out.println("Even no.->"+a);
continue;
            }
            System.out.println("Odd no -> " +a);
        }
    }
}
