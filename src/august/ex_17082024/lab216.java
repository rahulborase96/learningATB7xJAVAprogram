package august.ex_17082024;

public class lab216 {
    public static void main(String[] args) {
        try {
            int a =10/0;
        } catch (Error e) {
            System.out.println("div by Zero");
        } finally {
            System.out.println("I will be executed anyHow!!");
        }

    }
}
