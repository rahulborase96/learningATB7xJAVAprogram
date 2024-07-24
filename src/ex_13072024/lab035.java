package ex_13072024;

public class lab035 {
    public static void main(String[] args) {


        int a = 10;
        boolean A = !(a<2 || a>20);
        //        = ! (False || False)
        //        = ! (False)
        //        = True

        boolean B = !(a<2 && a>20);
        //        = ! (False && False)
        //        = ! (False)
        //        = True

        System.out.println(A);
        System.out.println(B);

    }
}
