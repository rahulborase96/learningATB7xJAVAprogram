package august.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lab221 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            int i =10/0;
        } catch (ArithmeticException e) {
            System.out.println("E1");
        }catch (Exception e){
            System.out.println("E2");
        }


        FileReader f = new FileReader(new File("/Users/RAHUL/Downloads/Core.Java.pdf"));
    }
}
