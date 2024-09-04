package august.ex_17082024;

import august.ex_11082024.exLoan.Son;

public class lab149 {
    public static void main(String[] args) {
        A a = new A();
        a.age =25;
        System.out.println(A.discount);
        a.m2();
        A.m1();  //Static

        /// Static don't need object ref. - True
    }

}
class  A{
    int age = 25;         //instance variable
    static  int discount =98; //static variable
    static {
        // SIB - STATIC initialization block

        System.out.println("one time load SIB ");
    }{
        // IIB - instance initialization block

        System.out.println("IIB when object is created");
    }
static void m1 (){
    System.out.println("m1");
}
void m2(){
        System.out.println("m2");
    }
}