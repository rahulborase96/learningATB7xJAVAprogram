package august.ex_17082024;

public class lab201 {
    public static void main(String[] args) {
    }
}

// Nested Class  - Rarely you will be using it


class  OC {
    Integer a =20;
    void OC_m1(){
        System.out.println(a);
        System.out.println("OC_m1");
    }
    class  InnerClass{
        Integer b = 200;
        void InnerClass_m2(){
            System.out.println(a);
            System.out.println(b);
            System.out.println("InnerClass_m1");

        }
    }

}