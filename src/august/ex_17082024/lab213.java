package august.ex_17082024;

public class lab213 {
    public static void main(String[] args) {
        System.out.println("Starting of Program");

        String ip = null;  // ArrayIndexOutOfBoundsException
        int b = 0;   // ArithmeticException
        try {
            ip = args[0];
            int a = Integer.parseInt(ip);  // NumberFormatException
            b = 1000/a;
        } catch (NumberFormatException| ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(ip);
        System.out.println("End of Program");

    }
}
