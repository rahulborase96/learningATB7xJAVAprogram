package ex_14072024;

public class lab047 {
    public static void main(String[] args) {
        int a =25;
        System.out.println(++a + a++ + a++);

        // A = ++a   Exp- 26 || a - 26
        //B= a++   Exp- 26 || a - 27
        // C = a++   Exp- 27 || a - 28

        System.out.println(a);

        System.out.println();
         int b =10;
        System.out.println(++b + b++ + b++);
        // A = ++b   Exp- 11 || b - 11
        //B= b++   Exp- 11 || b - 12
        // C = b++   Exp- 12 || b - 13
        System.out.println(b);





    }
}
