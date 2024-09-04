package august.ex_17082024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab210 {
    public static void main(String[] args) {
        //Exceptions
//        //Checked --JVM Knows
//        try {
//            FileInputStream file = new FileInputStream("C.//log.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


        //Unchecked
        try {
            int a =20;
            int b =a/0;
            System.out.println(b);
        } catch (Exception e) {
            System.out.println("Error divided by zero");
        }

    }
}
