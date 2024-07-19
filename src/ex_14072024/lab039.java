package ex_14072024;

public class lab039 {
    public static void main(String[] args) {

        //type of casting -> source and destination conversion

        //widening
        byte a =10;
        int b= a;   //valid -implicit casting
        int b1 =(int) a;   //valid -explicit casting

        System.out.println(b1);

        //Narrowing

        int a2= 250;
//        byte b2 = a2;  //invalid implicit casting
        byte b3 = (byte)a2;  //invalid explicit casting //loss pf data
        System.out.println(b3);
    }
}
