package august.ex_17082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lab217 {
    public static void main(String[] args) {
            try {
                int a = 10 / 0; // Uncheck Ath E
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }

            try {
                FileReader f = new FileReader(new File("c://a.txt"));
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }

    }
}
