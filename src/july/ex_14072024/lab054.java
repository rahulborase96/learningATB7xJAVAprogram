package july.ex_14072024;

public class lab054 {
    public static void main(String[] args) {

        String s1 =new String("The Testing Academy");
        String s2 =new String("The Testing Academy");
        String s3 =new String("The Testing Academy");

       // String =3 in Heap area

        System.out.println(s1==s2);           // for check ref
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));    //for check content

    }
}
