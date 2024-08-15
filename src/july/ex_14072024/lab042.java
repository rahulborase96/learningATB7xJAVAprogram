package july.ex_14072024;

public class lab042 {
    public static void main(String[] args) {
    //pre increment ++ operand   //value is incremented first then stored in result
        int a =1110;
        int b = ++a;
        // exp is b=11, & also a =11
        System.out.println(a);
        System.out.println(b);

        //post increment  //value stored in result then incremented later
        int a_post = 12;
        System.out.println(a_post++);
        System.out.println(a_post);

    }
}
