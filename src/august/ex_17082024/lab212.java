package august.ex_17082024;

public class lab212 {
    public static void main(String[] args) {
        System.out.println("Starting of Program");

        String ip = null;  // ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        int a = 0;  // NumberFormatException
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());

        }
        int b = 0;   // ArithmeticException
        try {
            b = 1000/a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(ip);
        System.out.println("End of Program");

    }
}
