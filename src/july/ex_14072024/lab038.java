package july.ex_14072024;

public class lab038 {
    public static void main(String[] args) {

        byte a=12;
        byte b=25;
        // byte c =a+b cant use it two operand use then result in specified type
        int c=a+b;
        System.out.println(c);


        char a2 ='A';
        char b2 ='B';
//         char c2 = a2+b2;     // AB is not char is bunch of char

        int c2 = a2+b2;
        System.out.println(c2);  // A+B ascii value 65+66
        System.out.println('A'==65);
        System.out.println('B'==66);
        System.out.println('B'==65);







    }
}
