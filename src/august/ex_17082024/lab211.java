package august.ex_17082024;

public class lab211 {
    public static void main(String[] args) {
        int x = 0;
        try {
            x = 10/0;
        } catch (Exception e) {
            System.out.println("Error Divided by zero");
        }
        System.out.println(x);
    }
}
